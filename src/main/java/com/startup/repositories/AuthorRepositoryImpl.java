package com.startup.repositories;

import com.startup.model.Author;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class AuthorRepositoryImpl implements Repository {



    private  static Map<Integer,Author> authorMap = new HashMap<>();
    @Override
    public Author find(int id) {
        if(null != authorMap.get(id)){
            System.out.println("from cach ..");
            return authorMap.get(id);
        }
        var author = new Author();
        author.setFullName("Mounir El Bakkali");
        author.setDateOfBirth(Date.valueOf(LocalDate.of(2003,9,25)));
        author.setBio("junior author");
        authorMap.put(id,author);
        return author;
    }

    @Override
    public List<Author> findAll() {
        return null;
    }

    @Override
    public void create(Author author) {

    }

    @Override
    public void delete(int id) {

    }
}
