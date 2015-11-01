package com.rdas.repos;

import com.rdas.TestAppMain;
import com.rdas.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.Assertions.assertThat;


/**
 * Created by rdas on 01/11/2015.
 */
@ActiveProfiles("qa")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {TestAppMain.class})
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void assertThatRepositoryIsInjected() {
        assertThat(personRepository).isNotNull();
    }

    @Test
    public void testSavePerson() {
        Person person = new Person();
        person.setUsername("rdas@hotmail.com");
        person.setPassword("pasw0rd");
        assertThat(person.getId()).isNull();

        personRepository.save(person);
        assertThat(person.getId()).isNotNull();
    }
}