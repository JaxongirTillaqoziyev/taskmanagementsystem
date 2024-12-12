package com.example.taskmanagementsystem.repository;

import com.example.taskmanagementsystem.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Page<Task> findByAssigneeId(Long assigneeId, Pageable pageable);
    Page<Task> findByAuthorId(Long authorId, Pageable pageable);
}
