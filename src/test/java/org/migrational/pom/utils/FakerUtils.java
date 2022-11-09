package org.migrational.pom.utils;

import com.github.javafaker.Faker;

public class FakerUtils {

    public long genericRandomNumber(){
        Faker  faker = new Faker();
        return faker.number().randomNumber();

    }
}
