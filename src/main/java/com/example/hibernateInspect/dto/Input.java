package com.example.hibernateInspect.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Input {
    private long membershipId;
    private long memberId;
    private String membershipPackage;
    private String mFirstName;
    private String mLastName;
}
