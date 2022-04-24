package com.employeemgmtapp.employeemgmt.jdbcConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcDataSourceConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcTemplate createConnection(){
        return new JdbcTemplate(dataSource);
    }
}
