package com.startup;

import com.startup.model.Author;
import com.startup.repositories.AuthorJPARepository;
import com.startup.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

@SpringBootApplication
@EnableJpaRepositories
public class StartUpApplication {


    //@Autowired private  static Calendar calendar ;
    @Autowired
    AuthorJPARepository repository;

    public static void main(String[] args) {
        SpringApplication.run(StartUpApplication.class,args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            Calendar calendar = ctx.getBean("calendar", Calendar.class);
            System.out.println(calendar.getTime());
            var author = new Author();
            author.setFullName("Mounir El bakkali");
            author.setBio("default bio");
            author.setDateOfBirth(Date.valueOf(LocalDate.of(2000,9,25)));
            repository.save(author);
        };
    }




}
