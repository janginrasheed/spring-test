package com.example.demo.topic;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.spring4.JdbiFactoryBean;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Collections;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public JdbiFactoryBean jdbiFactoryBean(DataSource dataSource) {
        JdbiFactoryBean jdbiFactoryBean = new JdbiFactoryBean(dataSource);

        // sqlobject-Plugin registrieren
        jdbiFactoryBean.setPlugins(Collections.singletonList(new SqlObjectPlugin()));

        return jdbiFactoryBean;
    }

    @Bean
    public Test test(Jdbi jdbi) {
        return jdbi.onDemand(Test.class);
    }

}
