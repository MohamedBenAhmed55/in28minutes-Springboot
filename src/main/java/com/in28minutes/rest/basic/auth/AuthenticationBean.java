package com.in28minutes.rest.basic.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AuthenticationBean {

    private String message;

    @Override
    public String toString() {
        return String.format("HelloWorldBean [message=%s]", message);
    }

}