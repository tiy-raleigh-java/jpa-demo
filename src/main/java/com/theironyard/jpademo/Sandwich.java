package com.theironyard.jpademo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sandwich {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String description;

    @OneToMany
    List<Condement> condementList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
