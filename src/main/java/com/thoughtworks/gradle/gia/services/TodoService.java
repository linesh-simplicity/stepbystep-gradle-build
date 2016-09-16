package com.thoughtworks.gradle.gia.services;

import com.thoughtworks.gradle.gia.domain.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    List<TodoItem> findAll();
    Optional<TodoItem> findById(long id);
    long add(TodoItem todo);
    void delete(TodoItem todoItem);
    void update(TodoItem todoItem);
}