package com.mytests.spring.jpa20.test_relations.repositories;

import com.mytests.spring.jpa20.test_relations.data.Address;
import com.mytests.spring.jpa20.test_relations.data.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 6/12/2018.
 * Project: jpa2relations
 * *******************************
 */
public interface AdressesRepository extends CrudRepository<Address, Integer> {

    @Query("select a from Address a where a.roomsAmount>2")
    List<Address> findLargeFlats();
}
