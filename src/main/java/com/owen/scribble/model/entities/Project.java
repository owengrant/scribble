package com.owen.scribble.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;
import java.util.UUID;

@RegisterForReflection
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_generator")
    @SequenceGenerator(name = "project_generator", sequenceName = "project_seq")
    private long id;

    @GeneratedValue
    private UUID uuid;

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

    public UUID getUuid() {
        return uuid;
    }

    public Project setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }
}
