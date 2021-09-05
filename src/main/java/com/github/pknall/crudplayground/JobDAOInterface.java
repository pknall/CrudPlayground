package com.github.pknall.crudplayground;

public interface JobDAOInterface {
    public void insert(Job job);
    public Job findById(int id);
}
