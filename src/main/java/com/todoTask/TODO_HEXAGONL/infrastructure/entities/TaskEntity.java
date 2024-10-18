package com.todoTask.TODO_HEXAGONL.infrastructure.entities;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private LocalDateTime creationDate;

    private boolean completed;

    public TaskEntity() {
    }

    public TaskEntity(boolean completed, LocalDateTime creationDate, String description, Long id, String title) {
        this.completed = completed;
        this.creationDate = creationDate;
        this.description = description;
        this.id = id;
        this.title = title;
    }
    //METHOD TO PUT THE DATA OF TASK IN THIS ENTITY    SE DEBE SUSTITUR POR UN MAPPER TODO
    public static TaskEntity fromModailModel (Task task){
        return(new TaskEntity(task.isCompleted(),task.getCreationDate(), task.getDescription(), task.getId(),task.getTitle()));
    }

    //PASAR DE ENTITY A TASK SOLO
    public Task toTaskModel(TaskEntity taskEntity){
        return new Task(taskEntity.isCompleted(), taskEntity.getCreationDate(),taskEntity.getDescription(),taskEntity.getId(),taskEntity.getTitle());
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
