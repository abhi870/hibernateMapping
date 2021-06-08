package com.example.hibernateInspect.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "umembership")
public class Membership {
    @Id
    @Column(name = "membershipid")
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name="uuidGenerator", strategy = "uuid2")
    private UUID membershipId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "memberid", referencedColumnName = "memberid")
    private Member member;

    @Column(name = "membershippackage")
    private String membershipPackage;
}
