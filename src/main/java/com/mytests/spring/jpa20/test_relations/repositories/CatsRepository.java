package com.mytests.spring.jpa20.test_relations.repositories;

import com.mytests.spring.jpa20.test_relations.data.Cat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/4/2017.
 * Project: jpa2relations
 * *******************************
 */
public interface CatsRepository extends CrudRepository<Cat, Integer> {

    List<Cat> findByOwnerAddressCity(String owner_address_city);
    List<Cat> findByOwner_Address_RoomsAmountAndBreedContaining(Integer owner_address_roomsAmount, String breed);
}
