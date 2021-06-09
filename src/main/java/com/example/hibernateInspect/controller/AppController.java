package com.example.hibernateInspect.controller;

import com.example.hibernateInspect.dto.Input;
import com.example.hibernateInspect.entity.Account;
import com.example.hibernateInspect.entity.Employee;
import com.example.hibernateInspect.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
public class AppController {

    @Autowired
    AppRepository appRepository;

    @PostMapping("/do")
    public boolean saveEmployee(@RequestBody Input input) {
        Employee employee = new Employee();
        employee.setEmail(input.getEmail());
        employee.setFirstName(input.getFirstName());
        employee.setLastname(input.getLastName());
        Set<Account> accountNumbers = new HashSet<>();
        input.getAccountNumbers().forEach(e->accountNumbers.add(getAccount(e)));
        employee.setAccounts(accountNumbers);
        appRepository.save(employee);
        return true;
    }

    public static Account getAccount(Long accountNumber) {
        Account a = new Account();
        a.setAccountNumber(accountNumber);
        return a;
    }
}
