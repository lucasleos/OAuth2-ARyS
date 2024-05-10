package com.ARyS.login;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    private Long id;
    private String nombre;
    private String contraseña;

}
