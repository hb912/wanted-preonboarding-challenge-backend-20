package com.example.wanted_market.domain.member.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class SignInRequestDto {

    private String id;
    private String password;
    private String username;
}
