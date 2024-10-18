package com.todoTask.TODO_HEXAGONL.infrastructure.adapters;

import com.todoTask.TODO_HEXAGONL.domain.models.AditionalTaskInfo;
import com.todoTask.TODO_HEXAGONL.domain.ports.out.ExternalServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ExternalServiceAdapter implements ExternalServicePort {

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public AditionalTaskInfo getAditionalTaskInfo(Long id) {
        //URL PETICION 1
        String apiUrl = "https://jsonplaceholder.typicode.com/todos/" + id;
        //Hacemos peticion
        ResponseEntity<JsonPlaceHolderTodo> responseEntity = restTemplate.getForEntity(apiUrl,JsonPlaceHolderTodo.class);
        //Traemos los datos y verificamos su existencia
        JsonPlaceHolderTodo todo = responseEntity.getBody();
        if (todo == null){
            return null;
        }

        apiUrl = "https://jsonplaceholder.typicode.com/users/"+todo.userId;
        ResponseEntity<JsonPlaceHolderUser> userResponse = restTemplate.getForEntity(apiUrl,JsonPlaceHolderUser.class);
        JsonPlaceHolderUser user = userResponse.getBody();
        if (user == null){
            return null;
        }
        return new AditionalTaskInfo(user.getName(), user.getId(), user.getEmail());
    }

    //ESTRUCTURA PARA PETICION 1
    public static class JsonPlaceHolderTodo {
        private Long id;
        private Long userId;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }
    }

    //ESTRUCTURA PARA LA PETICION 2
    public static class JsonPlaceHolderUser{
        private Long id;
        private String name;
        private String email;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}


