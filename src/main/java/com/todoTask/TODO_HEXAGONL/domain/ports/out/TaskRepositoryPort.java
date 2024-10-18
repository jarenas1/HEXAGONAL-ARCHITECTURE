package com.todoTask.TODO_HEXAGONL.domain.ports.out;

import com.todoTask.TODO_HEXAGONL.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task save (Task task);

    Optional<Task> findById(Long id);

    List<Task> findAll();

    Optional<Task> update(Task task);

    boolean deleteById(Long id);
}
