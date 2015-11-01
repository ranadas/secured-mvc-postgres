package com.rdas.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Created by rdas on 01/11/2015.
 */
@Configuration
@ConfigurationProperties(value = "spring.datasource")
public class PgSqlApplicationProperties {

    @Getter
    @Setter
    private String driverClassName;
    @Getter
    @Setter
    private String url;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;

    @PostConstruct
    public void postConstruct() {
        System.out.println("HEREE");
    }

    @Bean(name = "datasource")
    public DataSource dataSource() {
        System.out.println("HEREE");
        DataSource dataSource = DataSourceBuilder.create().driverClassName(driverClassName).url(url).username(username).password(password).build();
        return dataSource;
    }
}
