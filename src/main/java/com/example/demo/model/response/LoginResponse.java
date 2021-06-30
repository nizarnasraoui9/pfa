package com.example.demo.model.response;

import com.example.demo.model.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class LoginResponse {
    private HttpStatus httpStatus;
    private String msg;
    private UserDTO userDTO;
    private String token;
}
