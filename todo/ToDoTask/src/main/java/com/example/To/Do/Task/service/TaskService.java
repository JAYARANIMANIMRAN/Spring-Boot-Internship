package com.example.To.Do.Task.service;
import com.example.To.Do.Task.model.Task;
import com.example.To.Do.Task.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



    @Service
    public class TaskService {

//        private final TaskRepo taskRepository;
        @Autowired
        TaskRepo taskRepository;

//        public TaskService(TaskRepo taskRepository) {
//            this.taskRepository = taskRepository;
//        }

        public List<Task> getAllTasks() {
            return taskRepository.findAll();
        }

        public Task addTask(Task task) {
            return taskRepository.save(task);

        }

        public Task updateTask(Long id, Task updatedTask) {
            return taskRepository.findById(id).map(task -> {
                task.setTitle(updatedTask.getTitle());
                task.setDescription(updatedTask.getDescription());
                task.setCompleted(updatedTask.isCompleted());
                return taskRepository.save(task);
            }).orElse(null);
        }

        public void deleteTask(Long id) {
            taskRepository.deleteById(id);
        }
    }


