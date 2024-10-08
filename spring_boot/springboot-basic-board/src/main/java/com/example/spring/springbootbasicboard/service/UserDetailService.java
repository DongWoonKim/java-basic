package com.example.spring.springbootbasicboard.service;

import com.example.spring.springbootbasicboard.config.security.CustomUserDetails;
import com.example.spring.springbootbasicboard.mapper.MemberMapper;
import com.example.spring.springbootbasicboard.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final MemberMapper memberMapper;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberMapper.signIn(username);
        if (member == null) {
            throw new UsernameNotFoundException(username + " not found");
        }

        return CustomUserDetails.builder()
                .member(member)
                .build(); // Member 정보를 가진 CustomUserDetails 반환
    }
}
