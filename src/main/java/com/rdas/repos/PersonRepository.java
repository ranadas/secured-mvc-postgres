package com.rdas.repos;

import com.rdas.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rdas on 01/11/2015.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByUsername(String username);
}
