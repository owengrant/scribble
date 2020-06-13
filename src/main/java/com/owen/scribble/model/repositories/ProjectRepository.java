package com.owen.scribble.model.repositories;

import com.owen.scribble.model.entities.Project;
import com.owen.scribble.model.utils.EntityMerger;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.vertx.core.json.JsonObject;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class ProjectRepository implements PanacheRepository<Project> {

    @Inject
    EntityManager em;

    @Transactional
    public Project update(long id, JsonObject data) {
        var project = findById(id);
        if(project == null) return null;
        return em.merge(EntityMerger.merge(data, project, Project.class));
    }
}
