package com.todoTask.TODO_HEXAGONL.aplication.usecases;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;
import com.todoTask.TODO_HEXAGONL.domain.ports.in.CreateTaskUseCase;
import com.todoTask.TODO_HEXAGONL.domain.ports.out.TaskRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateTaskUseCaseImp implements CreateTaskUseCase {

    //INYECTAMOS EL REPO DEL PUERTO OUT
    @Autowired
    private TaskRepositoryPort taskRepositoryPort;

    //IMPLEMENTAMOS CADA INTERFAZ ASOCIADA PARA DARLE LA LOGICA DEL NEGOCIO,
    //LA LOGICA DEL NEGOCIO SERÁ AÑADIDA MÁS ADELANTE, POR AHORA USAMOS EL REPOSITORYLP
    @Override
    public Task createTask(Task task) {

        return taskRepositoryPort.save(task);
    }
}
