package com.todoTask.TODO_HEXAGONL.domain.models;

import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Task {

    private Long id;

    private String title;

    private String description;

    private LocalDateTime creationDate;

    private boolean completed;

    public Task(boolean completed, LocalDateTime creationDate, String description, Long id, String title) {
        this.completed = completed;
        this.creationDate = creationDate;
        this.description = description;
        this.id = id;
        this.title = title;
    }

    public Task() {
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
