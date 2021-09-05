package com.github.pknall.crudplayground;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Data
@Repository
public class JobDAOImpl implements JobDAOInterface {
    private JdbcTemplate jdbc;
    private DataSource dataSource_Bean;                          // This is set by Application Context in main()

    // Required by XML bean assignment
    //public JobDAOImpl() {
    //
    //}

    //@Autowired
    //public JobDAOImpl(JdbcTemplate jdbc) {
    //    this.jdbc = jdbc;
    //}

    // Not necessary with Lombok
    //public void setDataSource_Bean(DataSource dataSource) {
    //    this.dataSource_Bean = dataSource;
    //}

    @Override
    public void insert(Job job) {
        String sql = "INSERT INTO JOB_LIST (ID, NAME, REPORTNAME) VALUES (?, ?, ?);";
        jdbc = new JdbcTemplate(dataSource_Bean);
        jdbc.update(sql, new Object[]{job.getID(), job.getName(), job.getReportName()});
    }

    @Override
    public Job findById(int id) {
        return null;
    }
}
