package com.rdas.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by rdas on 31/10/2015.
 */
@Data
@Entity
@EqualsAndHashCode
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"username"})})
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String password;
}
