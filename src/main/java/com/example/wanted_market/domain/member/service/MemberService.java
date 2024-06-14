package com.example.wanted_market.domain.member.service;

import com.example.wanted_market.domain.member.dto.SignInRequestDto;
import com.example.wanted_market.domain.member.model.Member;
import com.example.wanted_market.domain.member.repository.MemberRepository;
import com.example.wanted_market.global.exception.BadRequestException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MessageSourceAccessor messageSource;
    private final MemberRepository memberRepository;

    @Transactional
    public Long signin(SignInRequestDto signInRequestDto) {
        memberRepository.findOneByMemberId(signInRequestDto.getId()).ifPresent(m -> {
            throw new BadRequestException("AU06", messageSource.getMessage("AU06"));
        });


        new Member(signInRequestDto.getId(), )
    }
}
