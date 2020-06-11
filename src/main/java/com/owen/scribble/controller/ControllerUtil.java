package com.owen.scribble.controller;

import io.vertx.core.json.JsonObject;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ControllerUtil {
    public <T> T mapTo(Object obj, Class<T> to) {
        return JsonObject.mapFrom(obj).mapTo(to);
    }
}
