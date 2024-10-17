package com.todoTask.TODO_HEXAGONL.domain.ports.in;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task>updateTask(Long id);
}
