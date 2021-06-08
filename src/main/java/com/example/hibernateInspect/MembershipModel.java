package com.example.hibernateInspect;

import com.example.hibernateInspect.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MembershipModel {

    private UUID membershipId;


    private UUID memberId;


    private String membershipPackage;
}
