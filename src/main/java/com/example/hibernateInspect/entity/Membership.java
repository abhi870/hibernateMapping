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
    @Column(name = "membershipid")
    private String membershipId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "memberid", referencedColumnName = "memberid")
    private Member member;

    @Column(name = "membershippackage")
    private String membershipPackage;
}
