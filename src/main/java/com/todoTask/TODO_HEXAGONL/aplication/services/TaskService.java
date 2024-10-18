package com.todoTask.TODO_HEXAGONL.aplication.services;

import com.todoTask.TODO_HEXAGONL.domain.models.AditionalTaskInfo;
import com.todoTask.TODO_HEXAGONL.domain.models.Task;
import com.todoTask.TODO_HEXAGONL.domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class TaskService implements CreateTaskUseCase, DeleteTaskUseCase, GetAdditionalTaskInfoUseCase, RetrieveTaskUseCase, UpdateTaskUseCase {

    //INYECTAMOS LAS DEPENENCIAS DE DONDE ESTÁ LA LOGICA DEL NEGOCIO POR MEDIO DE CONSTRUCTORES
    private final CreateTaskUseCase createTaskUseCase;

    private final RetrieveTaskUseCase retrieveTaskUseCase;

    private final UpdateTaskUseCase updateTaskUseCase;

    private final DeleteTaskUseCase deleteTaskUseCase;

    private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    public TaskService(CreateTaskUseCase createTaskUseCase, RetrieveTaskUseCase retrieveTaskUseCase, UpdateTaskUseCase updateTaskUseCase, DeleteTaskUseCase deleteTaskUseCase, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
    }

    //IMPLEMENTAMOS EL CONTRATO Y LLAMAMOS LA LOGICA POR MEDIO DE LAS DEPENDENCIAS
    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public Task delete(Long id) {
        return deleteTaskUseCase.delete(id);
    }

    @Override
    public AditionalTaskInfo getAditionalTaskInfo(Long id) {
        return getAdditionalTaskInfoUseCase.getAditionalTaskInfo(id);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAll() {
        return retrieveTaskUseCase.getAll();
    }

    @Override
    public Optional<Task> updateTask(Long id) {
        return updateTaskUseCase.updateTask(id);
    }
}
