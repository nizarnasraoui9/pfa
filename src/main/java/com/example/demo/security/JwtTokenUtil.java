package com.example.demo.security;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenUtil {

    //Tokens are valid for 7 days from the time of creation, time is in seconds
    @Value("${jwt.duration}")
    public Integer duration;

    //Get the key value configured in the application.properties . file
    //This key is used for encryption and decryption
    @Value("${jwt.secret}")
    private String secret;

    //Generate tokens
    public String generateToken(UserDetails userDetails) {
        //Save the User's Authorities information in claims
        Map<String, Object> claims = new HashMap<>();

        //1.Define claims: issuer, expiration, subject, id
        //2. Token encryption using HS512 algorithm and secret key
        //3. Convert to a secure URL string
        //4. Add generated string with prefix Bearer
        String token = Jwts.builder()
                .setClaims(claims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + duration * 1000))
                .signWith(SignatureAlgorithm.HS512, secret).compact();

        return token;
    }

    //Get the information stored in the token
    public Claims getClaimsFromToken(String token) {
        //Check if the token starts with the prefix
        if (token == null) return null;
        try {
            return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException e) {
            return null;
        }
    }

    // Get user information from jwt
    public Long getUserIdFromJWT(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();

        return Long.parseLong(claims.getSubject());
    }

    public boolean validateToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(authToken);
            return true;
        } catch (MalformedJwtException ex) {
            System.out.println("Invalid JWT token");
        } catch (ExpiredJwtException ex) {
            System.out.println("Expired JWT token");
        } catch (UnsupportedJwtException ex) {
            System.out.println("Unsupported JWT token");
        } catch (IllegalArgumentException ex) {
            System.out.println("JWT claims string is empty.");
        }
        return false;
    }
}
