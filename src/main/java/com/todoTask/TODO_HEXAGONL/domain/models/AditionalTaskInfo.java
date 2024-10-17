package com.todoTask.TODO_HEXAGONL.domain.models;

public class AditionalTaskInfo {
    //CREAMOS CONSTANTES YA QUE ESTA INFO VIENE DE UN SERVICIO EXTERNO QUE NO PODREMOS MODIFICAR
    private final Long userId;
    private final String userName;
    private final String userEmail;

    public AditionalTaskInfo(String userName, Long userId, String userEmail) {
        this.userName = userName;
        this.userId = userId;
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
