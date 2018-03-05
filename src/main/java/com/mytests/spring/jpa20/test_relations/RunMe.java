package com.mytests.spring.jpa20.test_relations;

import com.mytests.spring.jpa20.test_relations.configs.MyConfig1;
import com.mytests.spring.jpa20.test_relations.data.Owner;
import com.mytests.spring.jpa20.test_relations.data.Cat;
import com.mytests.spring.jpa20.test_relations.services.CatService;
import com.mytests.spring.jpa20.test_relations.services.OwnersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * *******************************************
 * Created by Irina.Petrovskaya on 10/4/2017.
 * Project: jpa2relations
 * *******************************************
 */
public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig1.class);
        OwnersService ownersService = ctx.getBean(OwnersService.class);
        CatService catService = ctx.getBean(CatService.class);
        System.out.println("==== owners by city:===");
        List<Owner> owners1 = ownersService.ownersByCity("SPb");
        for (Owner next : owners1) {
            System.out.println(next.toString());
        }
        System.out.println("=== owners by cat breed:===");
        List<Owner> owners2 = ownersService.ownersByCatBreed("coon");
        for (Owner next: owners2){
            System.out.println(next.toString());
        }
        System.out.println("=== owners without cats:===");
        List<Owner> owners3 = ownersService.ownersWithoutcats();
        for (Owner next: owners3){
            System.out.println(next.toString());
        }
        System.out.println("=== owners with large apartments:===");
        List<Owner> owners4 = ownersService.ownersWithLargeApartments();
        for (Owner next: owners4){
            System.out.println(next.toString());
        }
        System.out.println("=== owner by cat name:===");
        System.out.println(ownersService.findCatOwner("Boromir"));

        System.out.println("=== cats in the city:==");
        List<Cat> cats = catService.catsByCity("SPb");
        for(Cat cat: cats){
            System.out.println(cat.toString());
        }
        System.out.println("=== check meta annotation for Query:==");
        List<Cat> cats2 = catService.catsByBreedLikePattern("coo","red");
        for (Cat cat:cats2){
            System.out.println(cat.toString());
        }
    }

}