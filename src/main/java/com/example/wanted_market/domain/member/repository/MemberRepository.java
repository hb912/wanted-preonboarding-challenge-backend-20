package com.example.wanted_market.domain.member.repository;

import com.example.wanted_market.domain.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
    public Optional<Long> findOneByMemberId(String memberId);
}
