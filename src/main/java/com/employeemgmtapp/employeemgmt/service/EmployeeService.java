package com.employeemgmtapp.employeemgmt.service;

import com.employeemgmtapp.employeemgmt.DAO.EmployeeDao;
import com.employeemgmtapp.employeemgmt.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }

}
