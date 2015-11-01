package com.rdas.comps;

import com.rdas.model.Person;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;

import static java.util.Arrays.asList;

/**
 * Created by rdas on 01/11/2015.
 */
@Component
public class PersonMapper {
    public UserDetails convert(Person person) {
        User user = new User(person.getUsername(), person.getPassword(), getGrantedAuthorities(person.getUsername()));
        return user;
    }

    private Collection<? extends GrantedAuthority> getGrantedAuthorities(String username) {
        Collection<? extends GrantedAuthority> authorities;
        if (username.contains("rdas")) {
            authorities = asList(() -> "ROLE_ADMIN", () -> "ROLE_BASIC");
        } else {
            authorities = asList(() -> "ROLE_USER");
        }
        return authorities;
    }
}
