package com.startup.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;



@Getter
@Setter
@ToString
public class Author {
    private  String fullName;
    private Date dateOfBirth ;
    private String bio;
}
