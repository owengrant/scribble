package com.owen.scribble.model.entities;

import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@RegisterForReflection
@Entity
public class Project {
    @Id
    @GeneratedValue
    private long id;

    @NotBlank
    @Column(length = 100)
    private String name;

    @NotBlank
    @Column(length = 500)
    private String description;

    private boolean completed = false;

    public Project() {
    }

    public Project(@NotBlank String name, @NotBlank String description) {
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public Project setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Project setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Project setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }
}
