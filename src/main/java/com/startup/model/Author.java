package com.startup.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;
import static jakarta.persistence.TemporalType.DATE;


@Entity
@Getter
@Setter
@ToString
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id ;
    @Column(name = "full_name")
    private  String fullName;
    @Temporal(DATE)
    @Column(name = "date_birth")
    private Date dateOfBirth ;
    private String bio;
}
