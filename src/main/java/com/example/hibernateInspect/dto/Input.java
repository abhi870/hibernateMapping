package com.example.hibernateInspect.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Input {

   private String firstName;
   private String lastName;
   private String email;
   private Set<Long> accountNumbers;

}
