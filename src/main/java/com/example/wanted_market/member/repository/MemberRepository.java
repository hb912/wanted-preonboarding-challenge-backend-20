package com.example.wanted_market.member.repository;

import com.example.wanted_market.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
