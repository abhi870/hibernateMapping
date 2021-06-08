package com.example.hibernateInspect.controller;

import com.example.hibernateInspect.MembershipModel;
import com.example.hibernateInspect.dto.Input;
import com.example.hibernateInspect.entity.Member;
import com.example.hibernateInspect.entity.Membership;
import com.example.hibernateInspect.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @Autowired
    AppRepository appRepository;

    @GetMapping("/get/{membershipId}")
    public MembershipModel get(@PathVariable String membershipId) {
        Membership m =  appRepository.findByMembershipId(membershipId);
        return new MembershipModel(m.getMembershipId(), m.getMember().getMemberId(), m.getMembershipPackage());
    }

    @GetMapping
    public String getSome(){
        return "success";
    }
    @PostMapping("/do")
    public boolean doSomething(@RequestBody Input input){
        Membership m = new Membership();
        Member m2 = new Member();
        m2.setFirstName(input.getFirstName());
        m2.setLastName(input.getLastName());
        m.setMember(m2);
        m.setMembershipPackage(input.getMembershipPackage());
        appRepository.save(m);
        return true;
    }
}
