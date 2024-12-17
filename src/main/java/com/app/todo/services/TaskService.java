package com.app.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.todo.models.Task;
import com.app.todo.repositories.TaskRepository;

@Service // Marks this class as a Spring service, making it a candidate for component
         // scanning and dependency injection.
public class TaskService {

    @Autowired // Injects the TaskRepository bean to interact with the database.
    private TaskRepository taskRepository;

    // Fetches all tasks from the database.
    public List<Task> getAllTasks() {
        return taskRepository.findAll(); // Returns a list of all tasks using the repository's findAll() method.
    }

    // Creates a new task with the provided title.
    public void createTask(String title) {
        Task task = new Task(); // Creates a new Task object.
        task.setTitle(title); // Sets the task's title.
        task.setCompleted(false); // By default, sets the task as not completed.
        taskRepository.save(task); // Saves the new task to the database.
    }

    // Deletes a task by its ID.
    public void deleteTask(Long id) {
        taskRepository.deleteById(id); // Deletes the task with the specified ID using the repository.
    }

    // Toggles the "completed" status of a task.
    public void toggleTask(Long id) {
        // Fetches the task by its ID or throws an exception if not found.
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Task id"));

        // Toggles the task's completion status.
        task.setCompleted(!task.isCompleted());
        // Saves the updated task back to the database.
        taskRepository.save(task);
    }
}
