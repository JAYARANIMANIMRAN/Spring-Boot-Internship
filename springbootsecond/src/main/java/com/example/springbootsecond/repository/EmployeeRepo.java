package com.example.springbootsecond.repository;
import com.example.springbootsecond.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

    List<Employee> findByJob(String job);

}
