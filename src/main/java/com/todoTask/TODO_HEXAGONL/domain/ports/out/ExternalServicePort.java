package com.todoTask.TODO_HEXAGONL.domain.ports.out;

import com.todoTask.TODO_HEXAGONL.domain.models.AditionalTaskInfo;

public interface ExternalServicePort {
    AditionalTaskInfo getAditionalTaskInfo(Long id);
}
