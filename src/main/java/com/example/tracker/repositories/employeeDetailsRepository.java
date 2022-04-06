package com.example.tracker.repositories;

import com.example.tracker.beans.employeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeDetailsRepository extends JpaRepository<employeeDetails,Integer> {
    employeeDetails findByName(String name);

    employeeDetails findByRole(String role);
}
