package com.example.hibernateInspect.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "membership", uniqueConstraints = {@UniqueConstraint(columnNames = "membershipid")})
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membershipid", unique = true, nullable = false)
    private Long membershipId;

    @Column(name = "membershippackage")
    private String membershipPackage;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "MEMBERSHIP_MEMBERSHIPID")
    private Set<Member> members;

}
