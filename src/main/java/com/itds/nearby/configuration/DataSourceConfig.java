package com.itds.nearby.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private final Environment environment;

    public DataSourceConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
        .driverClassName(environment.getRequiredProperty("oracle.driverName"))
        .url(environment.getRequiredProperty("oracle.url"))
        .username(environment.getRequiredProperty("oracle.login"))
        .password(environment.getRequiredProperty("oracle.password"))
        .build();
    }
}
