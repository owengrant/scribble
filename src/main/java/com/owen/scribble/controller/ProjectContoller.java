package com.owen.scribble.controller;

import com.owen.scribble.controller.schema.ProjectPost;
import com.owen.scribble.controller.schema.ProjectPut;
import com.owen.scribble.model.entities.Project;
import com.owen.scribble.model.repositories.ProjectRepository;
import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Tag(name = "Project")
@Path("/api/v1/projects")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProjectContoller {

    @Inject
    ProjectRepository projectRepo;

    @Inject
    ControllerUtil util;

    @POST
    public Project createProject(@Parameter(required = true) ProjectPost data) {
        var project = util.mapTo(data, Project.class);
        projectRepo.persistAndFlush(project);
        return project;
    }

    @GET
    @APIResponse(
            content =  @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Project[].class)
            )
    )
    public List<Project> readProjects() {
        return projectRepo.findAll().list();
    }

    @Path("{id}")
    @GET
    public Project readProject(@PathParam("id") long pid) {
        return projectRepo.findById(pid);
    }

    @Path("{id}")
    @PUT
    public Project updateProject(@PathParam("id") long pid, @Parameter(required = true) ProjectPut data) {
        return projectRepo.update(pid, JsonObject.mapFrom(data));
    }

    @Path(("{id}"))
    @DELETE
    public Response deleteProject(@PathParam("id") long pid) {
        var deleted = projectRepo.deleteById(pid);
        return Response.status(deleted ? 204 : 404).build();
    }

}
