package com.example.hibernateInspect.controller;

import com.example.hibernateInspect.MembershipModel;
import com.example.hibernateInspect.dto.Input;
import com.example.hibernateInspect.entity.Member;
import com.example.hibernateInspect.entity.Membership;
import com.example.hibernateInspect.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class AppController {

    @Autowired
    AppRepository appRepository;

    @GetMapping("/get/{membershipId}")
    public MembershipModel get(@PathVariable String membershipId) {
        Membership m =  appRepository.findByMembershipId(membershipId);
        return new MembershipModel(m.getMembershipId(), m.getMembers().stream().map(e->e.getMemberId()).collect(Collectors.toList()), m.getMembershipPackage());
    }

    @GetMapping
    public String getSome(){
        return "success";
    }
    @PostMapping("/do")
    public boolean doSomething(@RequestBody Input input){
        Membership m = new Membership();
        Set<Member> mems = new HashSet<>();
        input.getMembers().stream().forEach(e->mems.add(getMember(e.getFirstName(), e.getLastName())));
        m.setMembers(mems);
        m.setMembershipPackage(input.getMembershipPackage());
        appRepository.save(m);
        return true;
    }
    public Member getMember(String firstName, String lastName){
        Member m = new Member();
        m.setFirstName(firstName);
        m.setLastName(lastName);
        return m;
    }
}
