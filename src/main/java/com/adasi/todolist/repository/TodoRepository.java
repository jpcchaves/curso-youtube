package com.adasi.todolist.repository;

import com.adasi.todolist.domain.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
