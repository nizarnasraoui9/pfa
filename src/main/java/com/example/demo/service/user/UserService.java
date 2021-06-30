package com.example.demo.service.user;

import com.example.demo.model.dto.UserDTO;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDTO checkLogin(String username, String password);
    User findUserById(Integer id);
    UserDTO updateUser(UserDTO userDTO);
    User addUser(UserDTO userDTO);

}
