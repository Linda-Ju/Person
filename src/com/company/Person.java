package com.company;

public class Person {
    int height;
    String gender;
    int age;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void walk() {
        if (age >= 2) {
            System.out.println("Can walk");
        } else {
            System.out.println("Can't walk");
        }
    }

    public void run() {
        if (age <= 80 && age >= 2) {
            System.out.println("Can run");
        } else {
            System.out.println("Can't run");
        }
    }

    public void talk() {
        if (age >= 3) {
            System.out.println("Can talk");
        } else {
            System.out.println("Can't talk");
        }
    }

    public void eat() {
        if (gender.equals("female")) {
            System.out.println("likes chocolate");
        } else {
            System.out.println("Likes meat");
        }
    }
}
