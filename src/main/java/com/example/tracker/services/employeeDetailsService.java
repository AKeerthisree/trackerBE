package com.example.tracker.services;

import com.example.tracker.beans.employeeDetails;
import com.example.tracker.repositories.employeeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeDetailsService {
    @Autowired
    private employeeDetailsRepository edR;

    public employeeDetails addEmployee(employeeDetails ed) {
        return  edR.save(ed);
    }

    public List<employeeDetails> addAllEmployees(List<employeeDetails> ed) {
        return edR.saveAll(ed);
    }

    public employeeDetails getEmployeeByID(int id) {
        return edR.findById(id).orElse(null);
    }

    public employeeDetails getEmployeeByName(String name) {
        return  edR.findByName(name);
    }

    public boolean deleteEmployeeByID(int id) {
        employeeDetails existingEMP = edR.getById(id);
        if(existingEMP != null) {
            edR.deleteById(id);
            return true;
        }
        return false;
    }

    public employeeDetails updateEmployee(employeeDetails ed) {
        employeeDetails existingEMP = edR.findById(ed.getId()).orElse(null);
        System.out.println(ed);
        if(existingEMP == null) {
            System.out.println("Emp not found");
            return  edR.save(ed);
        }else  {
            existingEMP.setName(ed.getName());
            existingEMP.setEmail(ed.getEmail());
            existingEMP.setRole(ed.getRole());
            edR.save(existingEMP);
        }
        return ed;
    }

    public List<employeeDetails> getAllEmployees() {
        return edR.findAll();
    }

    public employeeDetails getEmployeeByRole(String role) {
        return  edR.findByRole(role);

    }
}
