package com.startup;

import com.startup.model.Author;
import com.startup.repositories.AuthorRepositoryImpl;
import com.startup.repositories.Repository;
import com.startup.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Calendar;

@SpringBootApplication
public class StartUpApplication {


    //@Autowired private  static Calendar calendar ;


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StartUpApplication.class);
        Calendar calendar = context.getBean("calendar", Calendar.class);
        AuthorService service = context.getBean(AuthorService.class);
        System.out.println(calendar.getTime());
        System.out.println(service.getAuthor(1));
        System.out.println(service.getAuthor(1));
    }




}
