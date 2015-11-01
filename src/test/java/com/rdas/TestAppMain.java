package com.rdas;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by rdas on 01/11/2015.
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.rdas.controller", "com.rdas.service", "com.rdas.components"})
@EntityScan(basePackages = {"com.rdas.model"})
@EnableJpaRepositories(basePackages = {"com.rdas.repos"})
@EnableTransactionManagement
public class TestAppMain {
}
