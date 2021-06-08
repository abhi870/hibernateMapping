package com.example.hibernateInspect.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "membership")
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membershipid")
    private long membershipId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "memberid", referencedColumnName = "memberid")
    private Member member;

    @Column(name = "membershippackage")
    private String membershipPackage;
}
