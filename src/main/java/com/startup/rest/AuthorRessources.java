package com.startup.rest;


import com.startup.model.Author;
import com.startup.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorRessources {

    @Autowired
    AuthorService service ;



    @GetMapping
    public ResponseEntity<List<Author>> getAuthors(){
        return ResponseEntity.ok(service.getAllAuthors());
    }


    @GetMapping(value = "/{id}",produces ="application/json")
    public Author getAuthor(@PathVariable int id){
        return service.getAuthor(id);
    }


    @PostMapping
    public ResponseEntity<Author> setAuthor(@RequestBody Author author){
            author = service.setAuthor(author);
            return ResponseEntity.ok(author);
    }




}
