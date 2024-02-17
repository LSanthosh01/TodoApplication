package com.tnsif.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.todoapp.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
