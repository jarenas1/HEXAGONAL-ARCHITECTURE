package com.todoTask.TODO_HEXAGONL.domain.ports.in;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTask(Long id); //get one

    List<Task> getAll(); //GETaLL
}
