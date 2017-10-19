package com.mytests.spring.jpa20.test_relations.repositories;

import com.mytests.spring.jpa20.test_relations.annotations.MyQuery;
import com.mytests.spring.jpa20.test_relations.data.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

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

    Boolean existsCatsByBreedAndOwner_Name(String breed, String owner_name);

    @MyQuery("select c from Cat c where c.breed like %:breed% and c.color like %:color_pattern%")
    List<Cat> findTheCatsILike(@Param("breed") String breed, @Param("color_pattern") String color );

}
