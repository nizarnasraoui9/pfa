package com.example.demo.controller;

import com.example.demo.model.dto.UserDTO;
import com.example.demo.model.mapper.UserMapper;
import com.example.demo.model.request.LoginRequest;
import com.example.demo.model.response.LoginResponse;
import com.example.demo.security.CustomUserDetails;
import com.example.demo.security.JwtTokenUtil;
import com.example.demo.service.user.UserService;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping(value = "/login")
    public ResponseEntity<?> checkLogin(@RequestBody LoginRequest request){

        try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    request.getUsername(),
                    request.getPassword()
            ));
            //Gen token
            String token = jwtTokenUtil.generateToken((CustomUserDetails) authentication.getPrincipal());

            //Add token to response
            LoginResponse loginResponse = new LoginResponse();
            loginResponse.setMsg("Logged in successfully");
            loginResponse.setUserDTO(UserMapper.toUserDTO(((CustomUserDetails) authentication.getPrincipal()).getUser()));
            loginResponse.setHttpStatus(HttpStatus.OK);
            loginResponse.setToken(token);

            return new ResponseEntity<LoginResponse>(loginResponse, loginResponse.getHttpStatus());
        } catch (Exception ex) {
            System.out.println("Incorrect account or password!");
            return ResponseEntity.ok(new LoginResponse());
        }
    }

    @PutMapping(value = "/user")
    public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO){
        System.out.println(userDTO.getId());
        System.out.println(userDTO.getUsername());
        System.out.println(userDTO.getPassword());
        System.out.println(userDTO.getFullname());
        System.out.println(userDTO.getPhoneNumber());
        System.out.println(userDTO.getAddress());
        System.out.println(userDTO.getCreateDate());

        UserDTO reDTO = userService.updateUser(userDTO);
        String token = jwtTokenUtil.generateToken(
                                        (CustomUserDetails)
                                                SecurityContextHolder
                                                        .getContext()
                                                        .getAuthentication()
                                                        .getPrincipal());
        //Add token to response
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setMsg("Update successful");
        loginResponse.setUserDTO(reDTO);
        loginResponse.setHttpStatus(HttpStatus.OK);
        loginResponse.setToken(token);
        return ResponseEntity.ok(loginResponse);
    }

    @PostMapping(value = "/user")
    public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO, HttpServletResponse response){
        User user = userService.addUser(userDTO);
        return ResponseEntity.ok(UserMapper.toUserDTO(user));
    }
}
