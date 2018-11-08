package com.codeup.closetrycorner.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="garment")
public class Garment {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable=false)
    private String date;

    @Column(nullable=false)
    private String image;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Outfits> Outfit;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="posts_categories",
            joinColumns = {@JoinColumn(name="garment_id")},
            inverseJoinColumns = {@JoinColumn(name="category_id")}
    )
    private List<Category> categories;
}