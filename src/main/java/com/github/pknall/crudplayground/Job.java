package com.github.pknall.crudplayground;

import lombok.Data;

@Data
public class Job {
    public Job(int ID, int name, int reportName) {
        this.ID = ID;
        this.name = name;
        this.reportName = reportName;
    }
    private int ID;
    private int name;
    private int reportName;
}
