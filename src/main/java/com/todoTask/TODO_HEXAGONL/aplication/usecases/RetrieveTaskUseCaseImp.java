package com.todoTask.TODO_HEXAGONL.aplication.usecases;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;
import com.todoTask.TODO_HEXAGONL.domain.ports.in.RetrieveTaskUseCase;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImp implements RetrieveTaskUseCase {
    @Autowired
    private RetrieveTaskUseCase retrieveTaskUseCase;

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAll() {
        return retrieveTaskUseCase.getAll();
    }
}
