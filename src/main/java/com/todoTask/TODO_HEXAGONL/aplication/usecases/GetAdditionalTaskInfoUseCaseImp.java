package com.todoTask.TODO_HEXAGONL.aplication.usecases;

import com.todoTask.TODO_HEXAGONL.domain.models.AditionalTaskInfo;
import com.todoTask.TODO_HEXAGONL.domain.ports.in.GetAdditionalTaskInfoUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class GetAdditionalTaskInfoUseCaseImp implements GetAdditionalTaskInfoUseCase {
    @Autowired
    private GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    @Override
    public AditionalTaskInfo getAditionalTaskInfo(Long id) {
        return getAdditionalTaskInfoUseCase.getAditionalTaskInfo(id);
    }
}
