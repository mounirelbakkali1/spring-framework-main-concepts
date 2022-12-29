package com.startup.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@ToString
@Entity
@Table(name = "books")
public class Book {

     @Id
     @GeneratedValue(strategy = IDENTITY)
     private int id ;
     private String title ;
     @ManyToOne
     @JoinColumn(name = "author_id")
     private Author author_id ;
     private String isbn ;
     private  int numOfPages;
}
