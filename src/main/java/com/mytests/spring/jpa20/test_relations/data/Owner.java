package com.mytests.spring.jpa20.test_relations.data;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/4/2017.
 * Project: jpa2relations
 * *******************************
 */
@Entity
@Table(name = "cat_owners", schema = "jbtests")
public class Owner {
    private int ownerId;
    private String name;
    private Address address;
    private List<Cat> cats;

    @OneToMany(mappedBy = "owner")
    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Id
    @Column(name = "owner_id")
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner that = (Owner) o;
        return ownerId == that.ownerId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ownerId, name);
    }

    @ManyToOne
    @JoinColumn(name = "address", referencedColumnName = "address_id")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressByAddress) {
        this.address = addressByAddress;
    }

    @Override
    public String toString() {
        return "Owner: " +
                "ownerId=" + ownerId +
                ", name='" + name + '\'' +
                ", adress=" + address.toString();
    }
}
