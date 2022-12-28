package com.startup.repositories;

import com.startup.model.Author;

import java.util.List;

public interface Repository {
    Author find(int id);
    List<Author> findAll();
    void create(Author t);
    void delete(int id);

}
