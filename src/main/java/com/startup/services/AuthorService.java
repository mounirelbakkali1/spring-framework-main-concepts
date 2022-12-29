package com.startup.services;

import com.startup.model.Author;
import com.startup.repositories.AuthorJPARepository;
import com.startup.repositories.AuthorRepositoryImpl;
import com.startup.repositories.Repository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuthorService {
    private  static Map<Integer,Author> authorMap = new HashMap<>();
    @Autowired
    private AuthorJPARepository repository ;


    public Author getAuthor(int id){
        if(null!= authorMap.get(id)) return authorMap.get(id);
        var authoor = repository.findById(id).orElse(null);
        authorMap.put(id,authoor);
        return authoor;
    }

    public Author setAuthor(Author author){
        return repository.save(author);
    }

    public List<Author> getAllAuthors() {
        return repository.findAll();
    }
}
