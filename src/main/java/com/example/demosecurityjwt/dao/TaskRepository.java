package com.example.demosecurityjwt.dao;

import com.example.demosecurityjwt.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
