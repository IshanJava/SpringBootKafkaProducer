package com.employeemgmtapp.employeemgmt.restcontroller;

import com.employeemgmtapp.employeemgmt.entity.Employee;
import com.employeemgmtapp.employeemgmt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmps")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }
}
