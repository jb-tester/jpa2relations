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
@Table(name = "address", schema = "jbtests")
public class Address {
    private int addressId;
    private String city;
    private String street;
    private Integer building;
    private Integer flat;
    private Integer roomsAmount;

    @Id
    @Column(name = "address_id")
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "building")
    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    @Basic
    @Column(name = "flat")
    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    @Basic
    @Column(name = "rooms_amount")
    public Integer getRoomsAmount() {
        return roomsAmount;
    }

    public void setRoomsAmount(Integer roomsAmount) {
        this.roomsAmount = roomsAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address that = (Address) o;
        return addressId == that.addressId &&
                Objects.equals(city, that.city) &&
                Objects.equals(street, that.street) &&
                Objects.equals(building, that.building) &&
                Objects.equals(flat, that.flat) &&
                Objects.equals(roomsAmount, that.roomsAmount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(addressId, city, street, building, flat, roomsAmount);
    }

    @Override
    public String toString() {
        return
                " city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                ", flat=" + flat +
                ", roomsAmount=" + roomsAmount +
                ' ';
    }
}
