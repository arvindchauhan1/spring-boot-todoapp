package com.app.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.app.todo.models.Task;
import com.app.todo.services.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Marks this class as a Spring MVC controller to handle HTTP requests.
public class TaskController {

    @Autowired // Injects the TaskService bean into this controller.
    private TaskService taskService;

    // Handles GET requests to the root URL ("/").
    @GetMapping
    public String getTasks(Model model) {
        // Fetches all tasks from the service layer.
        List<Task> tasks = taskService.getAllTasks();
        // Adds the list of tasks to the model for rendering in the view (tasks.html).
        model.addAttribute("tasks", tasks);
        return "tasks"; // Returns the name of the view template to render.
    }

    // Handles POST requests to the root URL ("/").
    @PostMapping
    public String createTask(@RequestParam String title) {
        // Calls the service layer to create a new task with the provided title.
        taskService.createTask(title);
        // Redirects to the root URL after creating the task.
        return "redirect:/";
    }

    // Handles GET requests for deleting a task with the specified ID.
    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        // Calls the service layer to delete the task identified by the ID.
        taskService.deleteTask(id);
        // Redirects back to the root URL after deleting the task.
        return "redirect:/";
    }

    // Handles GET requests for toggling the completion status of a task.
    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id) {
        // Calls the service layer to toggle the task's status (e.g.,
        // complete/incomplete).
        taskService.toggleTask(id);
        // Redirects back to the root URL after toggling the task.
        return "redirect:/";
    }
}
