package com.example.wanted_market.domain.member.controller;

import com.example.wanted_market.domain.member.dto.LoginRequestDto;
import com.example.wanted_market.domain.member.dto.SignInRequestDto;
import com.example.wanted_market.domain.member.service.MemberService;
import com.example.wanted_market.global.exception.BadRequestException;
import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MessageSourceAccessor messageSource;
    private final MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDto loginRequestDto){

    }

    @PostMapping("/sign-in")
    public ResponseEntity<?> signin(@RequestBody SignInRequestDto signInRequestDto){
        URI selfLink = URI.create(ServletUriComponentsBuilder.fromCurrentRequestUri().toUriString());

        if(StringUtils.isBlank(signInRequestDto.getId())){
            throw new BadRequestException("AU04", messageSource.getMessage("AU04", new String[]{"id"}));
        }

        if(StringUtils.isBlank(signInRequestDto.getPassword())){
            throw new BadRequestException("AU04", messageSource.getMessage("AU04", new String[]{"password"}));
        }

        if(signInRequestDto.getId().length()>20){
            throw new BadRequestException("AU05", messageSource.getMessage("AU04", new String[]{"id"}));
        }

        if(signInRequestDto.getPassword().length()>20){
            throw new BadRequestException("AU05", messageSource.getMessage("AU04", new String[]{"password"}));
        }

        Long memberId=memberService.signin(signInRequestDto);

        return ResponseEntity.created(selfLink).body(memberId);

    }
}
