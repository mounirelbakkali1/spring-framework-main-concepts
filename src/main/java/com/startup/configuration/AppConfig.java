package com.startup.configuration;


import com.startup.repositories.AuthorRepositoryImpl;
import com.startup.repositories.Repository;
import com.startup.utils.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan("com.startup")
public class AppConfig {



    @Bean(name = "calendar")
    public CalendarFactory getCalendar(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDay(3);
        return factory;
    }


    @Bean
    public Calendar calendar() throws Exception {
        return getCalendar().getObject();
    }
}
