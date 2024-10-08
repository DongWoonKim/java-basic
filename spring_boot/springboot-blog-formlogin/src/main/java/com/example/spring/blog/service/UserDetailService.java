package com.example.spring.blog.service;

import com.example.spring.blog.config.security.CustomUserDetails;
import com.example.spring.blog.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return usersRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException(email))
                .toCustomUserDetails();
    }
}
