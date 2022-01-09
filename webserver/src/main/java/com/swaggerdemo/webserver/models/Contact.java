package com.swaggerdemo.webserver.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Contact {
    private int id;
    private String firstName;
    private String lastName;
}
