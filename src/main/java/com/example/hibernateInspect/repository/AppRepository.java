package com.example.hibernateInspect.repository;

import com.example.hibernateInspect.entity.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<Membership, String> {
    Membership findByMembershipId(String membershipId);
}
