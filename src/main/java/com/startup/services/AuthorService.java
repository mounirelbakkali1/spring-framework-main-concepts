package com.startup.services;

import com.startup.model.Author;
import com.startup.repositories.AuthorRepositoryImpl;
import com.startup.repositories.Repository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class AuthorService {
    @Autowired
    private Repository repository ;



    @PostConstruct
    public void helloService(){
        System.out.println("hello service");
    }

    public Author getAuthor(int id){
        return repository.find(id);
    }
}
