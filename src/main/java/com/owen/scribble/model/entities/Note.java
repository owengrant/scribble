package com.owen.scribble.model.entities;

import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.persistence.*;
import java.util.UUID;

@RegisterForReflection
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "note_generator")
    @SequenceGenerator(name = "note_generator", sequenceName = "note_seq")
    private long id;

    @Column(nullable = false)
    private UUID resource_uuid;

    private String note;

    public long getId() {
        return id;
    }

    public Note setId(long id) {
        this.id = id;
        return this;
    }

    public String getNote() {
        return note;
    }

    public Note setNote(String note) {
        this.note = note;
        return this;
    }

    public UUID getResource_uuid() {
        return resource_uuid;
    }

    public Note setResource_uuid(UUID resource_uuid) {
        this.resource_uuid = resource_uuid;
        return this;
    }
}
