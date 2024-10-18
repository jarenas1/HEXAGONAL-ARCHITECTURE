package com.todoTask.TODO_HEXAGONL.aplication.usecases;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;
import com.todoTask.TODO_HEXAGONL.domain.ports.in.DeleteTaskUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteTaskUseCaseImp implements DeleteTaskUseCase{

    @Autowired
    private DeleteTaskUseCase deleteTaskUseCase;


    @Override
    public Task delete(Long id) {
        return deleteTaskUseCase.delete(id);
    }
}
