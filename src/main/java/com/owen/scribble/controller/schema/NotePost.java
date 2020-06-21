package com.owen.scribble.controller.schema;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@RegisterForReflection
@Schema
public class NotePost {
    private String note;

    public String getNote() {
        return note;
    }

    public NotePost setNote(String note) {
        this.note = note;
        return this;
    }
}
