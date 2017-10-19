package com.mytests.spring.jpa20.test_relations.services;

import com.mytests.spring.jpa20.test_relations.data.Cat;

import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/4/2017.
 * Project: jpa2relations
 * *******************************
 */
public interface CatService {

    List<Cat> catsByCity(String city);
    List<Cat> catsByRoomsAmountAndBreed(int amount, String breed);
    List<Cat> catsByBreedLikePattern(String pattern1, String pattern2);
}
