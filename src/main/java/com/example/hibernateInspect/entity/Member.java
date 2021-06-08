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
@Table(name = "umember")
public class Member {
    @Id
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name="uuidGenerator", strategy = "uuid2")
    @Column(name = "memberid")
    private UUID memberId;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

    @OneToOne(mappedBy = "member")
    private Membership membership;
}
