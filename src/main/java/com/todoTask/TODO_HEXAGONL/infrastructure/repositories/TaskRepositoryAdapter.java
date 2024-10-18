package com.todoTask.TODO_HEXAGONL.infrastructure.repositories;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;
import com.todoTask.TODO_HEXAGONL.domain.ports.out.TaskRepositoryPort;
import com.todoTask.TODO_HEXAGONL.infrastructure.entities.TaskEntity;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;
import java.util.Optional;

//POR MEDIO DE ESTE ADAPTER PASAREMOS EL REPO A ESTA ENTIDAD DE ABAJO
public class TaskRepositoryAdapter implements TaskRepositoryPort {

    @Autowired //inyectamos el repo para extraer sus metodos
    private TaskRepository taskRepository;

    @Override
    public Task save(Task task) {
        //casting entity
        TaskEntity taskEntity = TaskEntity.fromModailModel(task);
        //saving the entity into the db using the repo
        TaskEntity taskEntitySaved = taskRepository.save(taskEntity);
        //casteamos a Task, ya que devuelve el moto un task
        return taskEntitySaved.toTaskModel(taskEntitySaved) ;
    }

    @Override
    public Optional<Task> findById(Long id) {
        //Created to acces to the "mapper""""
        TaskEntity taskEntity = new TaskEntity();
        //find and change the optional to Task
        return taskRepository.findById(id).map(taskEntity::toTaskModel);
    }

    @Override
    public List<Task> findAll() {
        //Created to acces to the "mapper""""
        TaskEntity taskEntity = new TaskEntity();
        //Tambien pasamos la lista de tipo taskEntity a task para poderla devolver
        return taskRepository.findAll().stream().map(taskEntity::toTaskModel).toList();
    }

    @Override
    public Optional<Task> update(Task task) {
        TaskEntity taskEntity = TaskEntity.fromModailModel(task);
        Optional<TaskEntity> optionalTaskEntity = taskRepository.findById(taskEntity.getId());

        optionalTaskEntity.ifPresentOrElse(taskEntity1 -> {
            TaskEntity taskUpdated = taskRepository.save(taskEntity1);
        },()->{
            throw new RuntimeException();
        });

        return Optional.of(task);
    }

    @Override
    public boolean deleteById(Long id) {
        Optional<TaskEntity> optionalTaskEntity = taskRepository.findById(id);

        optionalTaskEntity.ifPresentOrElse(taskEntity1 -> {
            taskRepository.delete(taskEntity1);
        },()->{
            throw new RuntimeException();
        });

        return true;
    }
    }
}
