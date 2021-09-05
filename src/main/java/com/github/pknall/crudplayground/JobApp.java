package com.github.pknall.crudplayground;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // "JobDAO_Bean" is the ID of the bean spelled out in "applicationContext.xml".
        // The actual bean is "JabDAOImpl", but since it implements JobDAOInterface the cast works.
        JobDAOInterface jobDAO = (JobDAOInterface) context.getBean("JobDAO_Bean");
        Job newJob = new Job(1, 2, 3);
        jobDAO.insert(newJob);
        context.close();
    }
}
