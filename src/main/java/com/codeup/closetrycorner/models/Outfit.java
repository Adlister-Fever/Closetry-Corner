package com.codeup.closetrycorner.models;

import javax.persistence.*;

@Entity
@Table(name = "outfit")
public class Outfit {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String description;

    @Column
    private String date;

    public Outfit(String description, String date) {
        this.description = description;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
