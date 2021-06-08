package com.example.hibernateInspect.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Input {

    private String membershipPackage;
    private List<MemberDto> memberDtos;

}
