package com.owen.scribble;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title="Scribble API",
                version = "1.0.0",
                contact = @Contact(
                        name = "Owen Grant",
                        email = "owen.dalmon.grant.@gmail.com")
        )
)
public class Scribble extends Application { }