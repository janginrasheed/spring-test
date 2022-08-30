package com.example.demo.topic;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.springframework.stereotype.Component;

import java.util.List;

public interface Test {

    @RegisterFieldMapper(Employee.class)
    @SqlQuery("select first_name from TBL_EMPLOYEES")
    public List<String> getH2Data();

}
