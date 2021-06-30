package com.example.demo.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LoginRequest {
    @NotBlank(message = "Email is empty")
    @Size(min = 1, max = 20, message = "Account must contain between 6-20 characters")
    private String username;
    @NotBlank(message = "Password is blank")
    @Size(min = 1, max = 20, message = "Password must contain between 6-20 characters")
    private String password;
}
