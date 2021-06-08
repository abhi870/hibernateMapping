package com.example.hibernateInspect.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "memberId")
    private List<Member> members;

    @Column(name = "membershippackage")
    private String membershipPackage;
}
