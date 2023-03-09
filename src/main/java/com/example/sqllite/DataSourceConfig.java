package com.example.sqllite;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean
    public DataSource getDataSource1() {

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
                dataSourceBuilder.url("jdbc:h2:file:C:/data/demodb2"); // WITH PERSISTENCE
//                dataSourceBuilder.url("jdbc:h2:mem:testdb");         // IN MEMORY- WITHOUT PERSISTENCE
                dataSourceBuilder.username("sa");
                dataSourceBuilder.password("");
                return dataSourceBuilder.build();

    }


}
