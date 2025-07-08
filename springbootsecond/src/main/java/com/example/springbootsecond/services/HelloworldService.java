package com.example.springbootsecond.services;
import com.example.springbootsecond.models.Employee;
import com.example.springbootsecond.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class HelloworldService {

    List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee(1, "Sana", "Developer"),
            new Employee(2, "Jaya", "Product Manager"),
            new Employee(3, "dhana", "Data Analyst")
    ));

    @Autowired
    EmployeeRepo empRepo;


    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    public Employee getEmployeesByID(int empID) {
        return empRepo.findById(empID).orElse(new Employee());
    }

    public List<Employee> getEmployeesByJob(String job) {

        return empRepo.findByJob(job);
    }


    public String addEmployee(Employee employee) {
        empRepo.save(employee);
        return "Employee added sucessfully";
    }


    public String UpdateEmployee(Employee employee) {
        empRepo.save(employee);
        return "Employee updated sucessfully";
    }


    public String deleteEmployeeById(int empID) {
        empRepo.deleteById(empID);
        return "Employee deleted sucessfully!!!!!!!!";
    }

}