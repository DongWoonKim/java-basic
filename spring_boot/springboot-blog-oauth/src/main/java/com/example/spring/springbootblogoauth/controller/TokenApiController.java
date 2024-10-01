package com.example.spring.springbootblogoauth.controller;

import com.example.spring.springbootblogoauth.dto.CreateAccessTokenRequest;
import com.example.spring.springbootblogoauth.dto.CreateAccessTokenResponse;
import com.example.spring.springbootblogoauth.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TokenApiController {

    private final TokenService tokenService;

    @PostMapping("/api/token")
    public ResponseEntity<CreateAccessTokenResponse> createNewAccessToken(
            @RequestBody CreateAccessTokenRequest request
    ) {
        String newAccessToken = tokenService.createNewAccessToken(request.getRefreshToken());

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(
                        CreateAccessTokenResponse.builder()
                                .accessToken(newAccessToken)
                                .build()
                );
    }

}
