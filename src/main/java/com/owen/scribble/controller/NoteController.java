package com.owen.scribble.controller;

import com.owen.scribble.controller.schema.NotePost;
import com.owen.scribble.model.entities.Note;
import com.owen.scribble.model.repositories.NoteRepository;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Tag(name = "Note")
@Path("/api/v1/notes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NoteController {

    @Inject
    NoteRepository noteRepo;

    @Inject
    ControllerUtil util;

//    @POST
//    @Operation(operationId = "createProjectNote")
//    public Note createNote(@PathParam("id") long pid, @Parameter(required = true) NotePost data) {
//        var note = util.mapTo(data, Note.class);
//        var created = noteRepo.create(note);
//        if(created == null) throw new BadRequestException();
//        return created;
//    }
//
//    @Path("{id}/notes")
//    @GET
//    @Operation(operationId = "readProjectNotes")
//    public List<Note> readNotes(@PathParam("id") long pid) {
//        return noteRepo.readAll();
//    }
//
//    @Path("{id}/notes/{nid}")
//    @DELETE
//    @Operation(operationId = "deleteProjectNote")
//    public Response deleteNote(@PathParam("nid") long nid) {
//        var deleted = noteRepo.deleteById(nid);
//        return Response.status(deleted ? 204 : 404).build();
//    }

}
