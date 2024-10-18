package com.todoTask.TODO_HEXAGONL.infrastructure.repositories;

import com.todoTask.TODO_HEXAGONL.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//REPO QUE ALIMENTARA
public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
}
