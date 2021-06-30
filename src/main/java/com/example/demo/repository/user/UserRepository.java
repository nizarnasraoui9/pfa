package com.example.demo.repository.user;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT u.* FROM User u WHERE u.username=?1 AND u.password=?2", nativeQuery = true)
    Optional<User> checkUser(String username, String password);

    User findByUsername(String username);
}

