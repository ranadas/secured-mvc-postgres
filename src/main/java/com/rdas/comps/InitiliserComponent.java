package com.rdas.comps;

import com.rdas.model.Person;
import com.rdas.repos.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rdas on 30/10/2015.
 */
@Component
public class InitiliserComponent implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger log = LoggerFactory.getLogger(InitiliserComponent.class);

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("\n\n{} \n\n", "InitiliserComponent Loading init data");

        personRepository.save(createInitPersons());
    }

    private List<Person> createInitPersons() {
        Person person1 = new Person();
        person1.setUsername("rdas@email.com");
        person1.setPassword("pass1");

        Person person2 = new Person();
        person2.setUsername("rana@email.com");
        person2.setPassword("pass");

        Person person3 = new Person();
        person3.setUsername("jen@email.com");
        person3.setPassword("pass3");


        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        return persons;

    }
}
