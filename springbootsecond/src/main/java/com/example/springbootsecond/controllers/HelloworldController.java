package com.example.springbootsecond.controllers;
import com.example.springbootsecond.models.Employee;
import com.example.springbootsecond.services.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employee")

public class HelloworldController {
    @Autowired
    private HelloworldService hws;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return hws.getAllEmployees();
    }


    @GetMapping("/{empID}")
    public Employee getEmployeesByID(@PathVariable int empID) {
        return hws.getEmployeesByID(empID);
    }

    @GetMapping("/job/{job}")
    public List<Employee> getEmployeesByJob(@PathVariable String job) {
        return hws.getEmployeesByJob(job);
    }

    @PostMapping
    public String postMethod(@RequestBody Employee employee) {
        return hws.addEmployee(employee);
    }


    @PutMapping
    public String putMethod(@RequestBody Employee employee) {

        return hws.UpdateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteMethod(@PathVariable int id) {
        return hws.deleteEmployeeById(id);
    }

}

