package com.owen.scribble.model.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Task {
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

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    public Task() {
    }

    public Task(@NotBlank String name, @NotBlank String description, boolean completed, Project project) {
        this.name = name;
        this.description = description;
        this.completed = completed;
        this.project = project;
    }

    public long getId() {
        return id;
    }

    public Task setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Task setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Task setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public Project getProject() {
        return project;
    }

    public Task setProject(Project project) {
        this.project = project;
        return this;
    }
}
