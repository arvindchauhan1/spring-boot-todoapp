package com.app.todo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Marks this class as a JPA entity, which will map to a database table.
@Data // Lombok annotation to generate getters, setters, toString, equals, and
      // hashCode methods.
public class Task {

    @Id // Indicates that this field is the primary key for the entity.
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Specifies that the persistence provider (e.g., Hibernate) will automatically
    // choose the generation strategy
    // for the primary key based on the database being used.
    private long id; // Unique identifier for each task.

    private String title; // Represents the title or name of the task.

    private boolean completed; // Indicates whether the task is completed (true) or not (false).
}
