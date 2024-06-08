package com.example.wanted_market.member.model;

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
    private Long custId;

    @Column(length=20, nullable = false)
    private String id;

    @Column(length=100)
    private String password;
}
