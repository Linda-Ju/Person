package com.company;

public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(5);
        person.setGender("male");
        person.setHeight(180);

        System.out.println(person.gender);
        person.walk();
        person.run();
        person.talk();
        person.eat();
    }
}
