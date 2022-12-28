package com.startup.utils;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;

public class CalendarFactory implements FactoryBean<Calendar> {

    Calendar instance = Calendar.getInstance();

    public void addDay(int num){
        instance.add(Calendar.DAY_OF_YEAR,num);
    }

    @Override
    public Calendar getObject() throws Exception {
        return instance;
    }

    @Override
    public Class<?> getObjectType() {
        return instance.getClass();
    }
}
