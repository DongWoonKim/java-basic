package com.example.spring.blog.dto;

import com.example.spring.blog.domain.Users;
import lombok.Getter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Getter
public class AddUserRequest {
    private String email;
    private String password;

    public Users toUsers(BCryptPasswordEncoder bCryptPasswordEncoder) {
        return Users.builder()
                .email(email)
                .password(bCryptPasswordEncoder.encode(password))
                .build();
    }

}
