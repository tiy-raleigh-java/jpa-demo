package com.theironyard.jpademo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Condement {

    @Id
    @GeneratedValue
    Integer id;

    String name;
    String color;
}
