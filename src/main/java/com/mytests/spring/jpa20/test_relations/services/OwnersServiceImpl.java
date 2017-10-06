package com.mytests.spring.jpa20.test_relations.services;

import com.mytests.spring.jpa20.test_relations.data.Owner;
import com.mytests.spring.jpa20.test_relations.repositories.OwnersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/4/2017.
 * Project: jpa2relations
 * *******************************
 */
@Service
//@Transactional
public class OwnersServiceImpl implements OwnersService {


    @Autowired
    private OwnersRepository repository;

    @Override
    public List<Owner> ownersByCity(String city) {
        return repository.findByAddress_City(city);
    }

    @Override
    public List<Owner> ownersByCatBreed(String breed) {
        return repository.findByCats_BreedContains(breed);
    }

    @Override
    public List<Owner> ownersWithoutcats() {
        return repository.findByCats_Empty();
    }

    @Override
    public List<Owner> ownersWithLargeApartments() {
        return repository.findByAddress_RoomsAmountGreaterThan(2);
    }

    @Override
    public Owner findCatOwner(String name) {
        return repository.findFirstByCats_CatName(name);
    }
}
