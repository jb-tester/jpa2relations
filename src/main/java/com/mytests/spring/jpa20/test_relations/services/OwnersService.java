package com.mytests.spring.jpa20.test_relations.services;

import com.mytests.spring.jpa20.test_relations.data.Owner;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/4/2017.
 * Project: jpa2relations
 * *******************************
 */

public interface OwnersService {
    List<Owner> ownersByCity(String city);
    List<Owner> ownersByCatBreed(String breed);
    List<Owner> ownersWithoutcats();
    List<Owner> ownersWithLargeApartments();
    Owner findCatOwner(String name);
}
