package com.example.wanted_market.domain.member.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {

    @Id
    @Generated
    private Long id;

    @Column(length=20, nullable = false)
    private String memberId;

    @Column(length=100)
    private String password;

    @Column(length=100)
    private String username;

    public Member(String id, String password, String userNm){
        this.memberId=id;
        this.password=password;
        this.username =userNm;
    }
}
