package com.github.pknall.crudplayground2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {
}
