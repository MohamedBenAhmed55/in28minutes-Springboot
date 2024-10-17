package com.in28minutes.rest.webservices.restful_web_services.helloworld;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class HelloWorldBean {

    @Override
    public String toString() {
        return String.format("Hello World Bean [message=%s]", message);
    }

    private final Object message;

    public HelloWorldBean(String message) {
        this.message = message;
    }
}
