package com.itds.nearby.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
        .driverClassName("oracle.jdbc.OracleDriver")
        .url("jdbc:oracle:thin:@nearby_high?TNS_ADMIN=C:/Users/Kamil/Desktop/kekek/Wallet_NearBy")
        .username("admin")
        .password("Ziemniak2306!")
        .build();
    }
}
