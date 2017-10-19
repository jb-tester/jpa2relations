package com.mytests.spring.jpa20.test_relations.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.data.jpa.repository.Query;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/18/2017.
 * Project: jpa2relations
 * *******************************
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Query(nativeQuery = false)
public @interface MyQuery {
    @AliasFor(annotation = Query.class)
    String value();
}
