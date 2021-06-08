package com.example.hibernateInspect;

import com.example.hibernateInspect.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MembershipModel {

    private String membershipId;


    private String memberId;


    private String membershipPackage;
}
