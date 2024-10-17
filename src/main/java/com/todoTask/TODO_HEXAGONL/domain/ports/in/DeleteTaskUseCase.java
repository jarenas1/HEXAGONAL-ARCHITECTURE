package com.todoTask.TODO_HEXAGONL.domain.ports.in;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;

public interface DeleteTaskUseCase {
    Task delete(Long id);
}
