package com.example.To.Do.Task.repository;
import com.example.To.Do.Task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {

}


