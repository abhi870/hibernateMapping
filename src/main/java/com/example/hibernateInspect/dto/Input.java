package com.example.hibernateInspect.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Input {

    private String membershipPackage;
    private String firstName;
    private String lastName;
}
