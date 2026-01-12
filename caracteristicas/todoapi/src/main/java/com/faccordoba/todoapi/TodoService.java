package com.faccordoba.todoapi;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange(url = "https://jsonplaceholder.typicode.com", accept = MediaType.APPLICATION_JSON_VALUE)
public interface TodoService {
    @GetExchange("/todos")
    List<Todo> findAll();

    @GetExchange("/todos/{id}")
    Todo findById(Long id);

    @GetExchange("/todos?userId={userId}")
    List<Todo> findByUserId(Long userId);

    @PostExchange("/todos")
    Todo save(Todo todo);

    @PutExchange("/todos/{id}")
    Todo update(Long id, Todo todo);

    @DeleteExchange("/todos/{id}")
    void delete(Long id);

}
