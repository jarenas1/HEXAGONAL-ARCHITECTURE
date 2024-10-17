package com.todoTask.TODO_HEXAGONL.domain.ports.in;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;

public interface CreateTaskUseCase {

    Task createTask(Task task);
}
