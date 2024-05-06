package com.salesianos.supermarket.models;

import com.salesianos.supermarket.utils.Randomizer;

public class Person {
    protected String name;
    protected int age;

    public Person() {
        this.name = Randomizer.getRandomName();
        this.age = Randomizer.getRandomAge();
    }
}
