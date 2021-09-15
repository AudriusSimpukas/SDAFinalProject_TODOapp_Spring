package com.example.todo.repo;

import com.example.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepo extends JpaRepository<Task, Long> {

    void deleteTaskById(Long id);

    Optional<Task> findTaskById(Long id);
}
