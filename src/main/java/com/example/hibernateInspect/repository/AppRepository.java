package com.example.hibernateInspect.repository;

import com.example.hibernateInspect.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeId(Long employeeId);
}
