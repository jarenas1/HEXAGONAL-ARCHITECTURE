package com.todoTask.TODO_HEXAGONL.domain.ports.in;

import com.todoTask.TODO_HEXAGONL.domain.models.AditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AditionalTaskInfo getAditionalTaskInfo(Long id);
}
