package com.mytests.spring.jpa20.test_relations.data;

import javax.persistence.*;
import java.util.Objects;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/4/2017.
 * Project: jpa2relations
 * *******************************
 */
@Entity
@Table(name = "cats", schema = "jbtests")
public class Cat {
    private int catId;
    private String catName;
    private String breed;
    private String color;
    private Owner owner;

    @Id
    @Column(name = "cat_id")
    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    @Basic
    @Column(name = "cat_name")
    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Basic
    @Column(name = "breed")
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat that = (Cat) o;
        return catId == that.catId &&
                Objects.equals(catName, that.catName) &&
                Objects.equals(breed, that.breed) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(catId, catName, breed, color);
    }

    @ManyToOne
    @JoinColumn(name = "owner", referencedColumnName = "owner_id")
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner catOwnersByOwner) {
        this.owner = catOwnersByOwner;
    }

    @Override
    public String toString() {
        return
                "catName='" + catName + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ' ';
    }
}
