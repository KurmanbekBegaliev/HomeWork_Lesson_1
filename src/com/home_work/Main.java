package com.home_work;

public class Main {

    public static void main(String[] args) {
        SchoolThatGraduated school = new SchoolThatGraduated("№223", "A.Navoi");
        SchoolThatGraduated school1 = new SchoolThatGraduated("234", "K.Marx");

        Father objectA = new Father(53, "Ivan", BloodType.FIRST, school, "OshSU");
        Son objectB = new Son(24, "Alex", BloodType.THIRD, school1, "OshTU", "Ak Shoola");
        Son objectC = new Son(22, "Billie", BloodType.SECOND, school1, "OshSu", "Danushka");

        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());

        objectA.say("object.");
        objectA.say();
        objectB.say();
        objectC.say("objectC say\'s");

    }
}
