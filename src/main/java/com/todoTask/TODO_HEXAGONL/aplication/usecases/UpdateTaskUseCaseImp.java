package com.todoTask.TODO_HEXAGONL.aplication.usecases;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;
import com.todoTask.TODO_HEXAGONL.domain.ports.in.UpdateTaskUseCase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UpdateTaskUseCaseImp implements UpdateTaskUseCase {

    @Autowired
    private UpdateTaskUseCase updateTaskUseCase;


    @Override
    public Optional<Task> updateTask(Long id) {
        return Optional.empty();
    }
}
