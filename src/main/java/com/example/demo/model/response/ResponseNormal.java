package com.example.demo.model.response.ResponseNormal;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseNormal {
    private String msg;
    private HttpStatus httpStatus;
}
