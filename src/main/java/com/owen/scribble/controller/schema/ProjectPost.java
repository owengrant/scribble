package com.owen.scribble.controller.schema;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@RegisterForReflection
@Schema
public class ProjectPost {
    private String name;
    private String description;

    public ProjectPost() {}

    public ProjectPost(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public ProjectPost setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProjectPost setDescription(String description) {
        this.description = description;
        return this;
    }
}
