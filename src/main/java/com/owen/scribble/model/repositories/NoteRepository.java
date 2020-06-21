package com.owen.scribble.model.repositories;

import com.owen.scribble.model.entities.Note;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class NoteRepository implements PanacheRepository<Note> {

    @Inject
    EntityManager em;


    @Transactional
    public Note create(Note note) {
        persistAndFlush(note);
        if(!isPersistent(note)) return null;
        return note;
    }

    @Transactional
    public List<Note> readAll() {
        return findAll().list();
    }

    @Transactional
    public boolean deleteById(long id) {
        var note = findById(id);
        if(note == null) return false;
        em.remove(note);
        return findById(id) == null;
    }

}
