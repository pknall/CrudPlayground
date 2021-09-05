package com.github.pknall.crudplayground2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String reportName;

    public Job() {

    }

    public Job(String name, String reportName) {
        this.name = name;
        this.reportName = name;
    }
}
