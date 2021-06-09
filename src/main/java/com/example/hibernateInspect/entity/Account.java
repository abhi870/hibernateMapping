package com.example.hibernateInspect.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name="uuidGenerator", strategy = "uuid2")
    @Column(name = "ID")
    private UUID accountId;

    @Column(name = "account_number")
    private Long accountNumber;

   @ManyToOne
   @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

}
