package com.owen.scribble.controller.schema;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@RegisterForReflection
@Schema
public class ProjectPut {
    private String name;
    private String description;
    private boolean completed = false;

    public ProjectPut() {
    }

    public ProjectPut(String name, String description, boolean completed) {
        this.name = name;
        this.description = description;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public ProjectPut setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProjectPut setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public ProjectPut setCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }
}
