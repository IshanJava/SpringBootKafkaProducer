package com.employeemgmtapp.employeemgmt.DAO;

import com.employeemgmtapp.employeemgmt.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> getAllEmployees(){
        String sql = "Select empId, firstName, lastName, email, departmentId " +
                     "from Employee";
        List<Employee> emp = new ArrayList<Employee>();
        emp = jdbcTemplate.query(sql,new BeanPropertyRowMapper(Employee.class));
        return emp;
    }

    public Employee getEmpById(int empId){
        Employee employee = new Employee();
        String sql = "Select empId, firstName, lastName, email, departmentId " +
                     "from Employee where empId = ?";
        employee = jdbcTemplate.queryForObject(sql, new Object[]{empId}, new BeanPropertyRowMapper<>(Employee.class));
        return employee;
    }

}
