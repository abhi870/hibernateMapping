package com.example.hibernateInspect;

import com.example.hibernateInspect.dto.MemberDto;
import com.example.hibernateInspect.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MembershipModel {

    private long membershipId;


    private List<MemberDto> memberId;


    private String membershipPackage;
}
