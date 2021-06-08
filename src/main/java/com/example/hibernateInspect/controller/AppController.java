package com.example.hibernateInspect.controller;

import com.example.hibernateInspect.MembershipModel;
import com.example.hibernateInspect.dto.Input;
import com.example.hibernateInspect.dto.MemberDto;
import com.example.hibernateInspect.entity.Member;
import com.example.hibernateInspect.entity.Membership;
import com.example.hibernateInspect.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class AppController {

    @Autowired
    AppRepository appRepository;

    @GetMapping("/get/{membershipId}")
    public MembershipModel get(@PathVariable String membershipId) {
        Membership m = appRepository.findByMembershipId(membershipId);
        List<MemberDto> memberDtoListL = new ArrayList<>();
        m.getMembers().forEach(e -> memberDtoListL.add(new MemberDto(e.getFirstName(), e.getLastName())));
        return new MembershipModel(m.getMembershipId(), memberDtoListL, m.getMembershipPackage());
    }

    @GetMapping
    public String getSome() {
        return "success";
    }

    @PostMapping("/do")
    public boolean doSomething(@RequestBody Input input) {
        Membership m = new Membership();
        List<Member> members = new ArrayList<>();
        input.getMemberDtos().forEach(e -> {
            Member mem = new Member();
            mem.setFirstName(e.getFirstName());
            mem.setLastName(e.getLastName());
            members.add(mem);
        });

        m.setMembers(members);
        m.setMembershipPackage(input.getMembershipPackage());
        appRepository.save(m);
        return true;
    }
}
