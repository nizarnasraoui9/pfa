package com.example.demo.security;

import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFillter extends OncePerRequestFilter {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        try{
            //Get tokens from req
            String jwt = getJwtFromRequest(httpServletRequest);
            if(jwt== null){
                filterChain.doFilter(httpServletRequest, httpServletResponse);
                return;
            }
            // Parse information from token
            Claims claims = jwtTokenUtil.getClaimsFromToken(jwt);
            if (claims == null) {
                filterChain.doFilter(httpServletRequest, httpServletResponse);
                return;
            }
            // Create Authentication object object
            UsernamePasswordAuthenticationToken authenticationToken = getAuthentication(claims);
            if (authenticationToken == null) {
                filterChain.doFilter(httpServletRequest, httpServletResponse);
                return;
            }
            // Authentication successful, save the Authentication object to SecurityContextHolder
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            filterChain.doFilter(httpServletRequest, httpServletResponse);
        }catch (Exception e){
            System.out.println("failed on set user authentication"+ e);
        }
    }

    private UsernamePasswordAuthenticationToken getAuthentication(Claims claims) {
        String username = claims.getSubject();

        if (username != null) {
            UserDetails user = userDetailsService.loadUserByUsername(username);
            return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        }
        return null;
    }

    private String getJwtFromRequest(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        // Check if Authorization header contains jwt information
        if(bearerToken == null){
            return null;
        }
        if(bearerToken.substring(7).equals("null")){
            return null;
        }
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }
}
