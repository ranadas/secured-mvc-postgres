package com.rdas.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by rdas on 01/11/2015.
 */
@Configuration
@EntityScan(basePackages = {"com.rdas.model"})
@EnableJpaRepositories(basePackages = {"com.rdas"})
@EnableTransactionManagement
@ComponentScan({"com.rdas.components"})
public class RepositoryConfiguration {
}