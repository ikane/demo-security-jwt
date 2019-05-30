package com.example.demosecurityjwt.api;

import com.example.demosecurityjwt.dao.TaskRepository;
import com.example.demosecurityjwt.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskApi {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping(path = "/tasks")
    public List<Task> getTasks() {
        return this.taskRepository.findAll();
    }

    @PostMapping(path = "/tasks")
    public Task creatTask(@RequestBody Task task) {
        return this.taskRepository.save(task);
    }
}
