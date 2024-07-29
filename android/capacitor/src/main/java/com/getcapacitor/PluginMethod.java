package com.getcapacitor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PluginMethod {
    String RETURN_PROMISE = "promise";

    String RETURN_CALLBACK = "callback";

    String RETURN_NONE = "none";

    String RETURN_STRING = "string"; //Only valid return type for sync methods.
    
    boolean isSync() default false;
    String returnType() default RETURN_PROMISE;
}
