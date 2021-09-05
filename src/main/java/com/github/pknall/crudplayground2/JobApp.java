package com.github.pknall.crudplayground2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //
        ///JobDAO jobDAO = (JobDAO) context.getBean("JobDAO");
        //
        JobRepository repo = (JobRepository) context.getBean(JobRepository.class);
        Job job = new Job("AHU", "AHU Report");
        job = repo.save(job);
    }
}
