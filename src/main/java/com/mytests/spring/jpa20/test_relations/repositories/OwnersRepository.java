package com.mytests.spring.jpa20.test_relations.repositories;

import com.mytests.spring.jpa20.test_relations.data.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/4/2017.
 * Project: jpa2relations
 * *******************************
 */
public interface OwnersRepository extends CrudRepository<Owner, Integer> {



    List<Owner> findByAddress_City(String address_city);

    List<Owner> findByAddress_RoomsAmountGreaterThan(Integer address_roomsAmount); // no completion here for Address fields expressions

    List<Owner> findByCats_Empty();// no parameters are necessary here. 'Can't resolve property Empty' error is shown

    List<Owner> findByCatsNotEmpty();
    List<Owner> findByCatsIsNotEmpty();

    List<Owner> findByCats_BreedContains(String cats_breed); // parameter of Cat type is required incorrectly, property not suggested and not validated

    Owner findFirstByCats_CatName(String name); // parameter of Cat type is required incorrectly, property not suggested and not validated
}
