package com.company;

public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(50);
        person.setGender("male");
        person.setHeight(180);

        System.out.println(person.gender);
        System.out.println("height: " + person.height);
        person.walk();
        person.run();
        person.talk();
        person.eat();
    }
}
