package com.faccordoba.todoapi;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class TraditionalTodoService {

    private final RestClient restClient;

    public TraditionalTodoService(RestClient.Builder builder) {
        this.restClient = builder.baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    public List<Todo> findAll() {
        return restClient.get()
                .uri("/todos")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Todo>>() {
                });
    }

    public Todo findById(Long id) {
        return restClient.get()
                .uri("/todos/{id}", id)
                .retrieve()
                .body(Todo.class);
    }

    public List<Todo> findByUserId(Long userId) {
        return restClient.get()
                .uri("/todos?userId={userId}", userId)
                .retrieve()
                .body(new ParameterizedTypeReference<List<Todo>>() {
                });
    }

    public Todo save(Todo todo) {
        return restClient.post()
                .uri("/todos")
                .contentType(MediaType.APPLICATION_JSON)
                .body(todo)
                .retrieve()
                .body(Todo.class);
    }

    public Todo update(Long id, Todo todo) {
        return restClient.put()
                .uri("/todos/{id}", id)
                .contentType(MediaType.APPLICATION_JSON)
                .body(todo)
                .retrieve()
                .body(Todo.class);
    }

    public void delete(Long id) {
        restClient.delete()
                .uri("/todos/{id}", id)
                .retrieve();
    }

}
