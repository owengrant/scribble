package com.owen.scribble.model.utils;

import io.vertx.core.json.JsonObject;

public class EntityMerger {
    public static <T> T merge(JsonObject source, T traget, Class<T> aClass) {
        var targetJson = JsonObject.mapFrom(traget);
        targetJson.mergeIn(source);
        return targetJson.mapTo(aClass);
    }
}
