package com.faccordoba.todoapi;

public record Todo(Long id, Long userId, String title, boolean completed) {
}
