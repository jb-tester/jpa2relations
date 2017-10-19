package com.mytests.spring.jpa20.test_relations.services;

import com.mytests.spring.jpa20.test_relations.data.Cat;
import com.mytests.spring.jpa20.test_relations.repositories.CatsRepository;
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
public class CatServiceImpl implements CatService {


    @Autowired
    private CatsRepository repository;

    @Override
    public List<Cat> catsByCity(String city) {
        return repository.findByOwnerAddressCity(city);
    }

    @Override
    public List<Cat> catsByRoomsAmountAndBreed(int amount, String breed) {
        return repository.findByOwner_Address_RoomsAmountAndBreedContaining(amount,breed);
    }

    @Override
    public List<Cat> catsByBreedLikePattern(String pattern1, String pattern2) {

        return repository.findTheCatsILike(pattern1, pattern2);
    }
}
