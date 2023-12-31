package com.adasi.todolist.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String todo;
    private boolean concluded;
    private LocalDate deadline;

    @ManyToOne
    @JoinColumn(
            name = "category_id",
            referencedColumnName = "id"
    )
    private Category category;

    private Date concludedAt;
    private Date createdAt;
    private Date updatedAt;

    public Todo() {
    }

    public Todo(Long id,
                String todo,
                boolean concluded,
                LocalDate deadline,
                Category category,
                Date concludedAt,
                Date createdAt,
                Date updatedAt) {
        this.id = id;
        this.todo = todo;
        this.concluded = concluded;
        this.deadline = deadline;
        this.category = category;
        this.concludedAt = concludedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public boolean isConcluded() {
        return concluded;
    }

    public void setConcluded(boolean concluded) {
        this.concluded = concluded;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getConcludedAt() {
        return concludedAt;
    }

    public void setConcludedAt(Date concludedAt) {
        this.concludedAt = concludedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
