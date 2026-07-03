package com.example.demo.entity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    ArrayList<Employee> emp=new ArrayList<Employee>();
    public MyController() {
        emp.add(new Employee(1, "John", 30,50000,"Manager"));
        emp.add(new Employee(2, "Mary", 30,30000,"Developer"));
        emp.add(new Employee(3, "John", 30,40000,"Developer"));
        emp.add(new Employee(4, "Mary", 30,20000,"Developer"));
        emp.add(new Employee(5, "John", 30,35000,"Tester"));
    }
    @GetMapping("/getAllEmployee")
    public List<Employee> getEmployees() {
        return emp;
    }
    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        for (Employee e:emp){
            if (e.getId()==id){
                return e;
            }

        }
        return null;
    }

}