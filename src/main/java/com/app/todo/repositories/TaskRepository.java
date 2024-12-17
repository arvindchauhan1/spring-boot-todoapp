package com.app.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.todo.models.Task;

// This interface serves as the repository for the Task entity, enabling database operations.
public interface TaskRepository extends JpaRepository<Task, Long> {
    // JpaRepository provides built-in CRUD operations:
    // - save() : To create or update a task.
    // - findById() : To fetch a task by its ID.
    // - findAll() : To retrieve all tasks.
    // - deleteById() : To delete a task by its ID.
    // - Additional features like pagination and sorting are also supported.

    // Task: The entity class being managed by this repository.
    // Long: The type of the primary key field in the Task entity.
}
