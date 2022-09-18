package com.company;

public class Main {

    public static void main(String[] args) {
        String[] commands = {"Sidet", "Legat"};
        Shelter shelter = new Shelter("Romashka", "Lenina 1");
        Shelter shelter2 = new Shelter("Roza", "KurmanjanDatka 34");


        Dog dog1 = new Dog();
        dog1.setName("Bobik");
        dog1.setBreed("Alabay");
        dog1.setColor(EnumColor.BLACK);
        dog1.setCommands(commands);
        dog1.setShelter(shelter2);

        Dog dog2 = new Dog("Rex", "Ovcharka", commands, EnumColor.BROWN, shelter);

        Dog dog3 = new Dog("Laika", "Pudel", EnumColor.WHITE, shelter2);

        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());
        System.out.println(dog3.getInfo());

        Dog.makeVoice();
        Dog.makeVoice("AUF");
        Dog.makeVoice("GUV", 2);

        //Остальные пункты в следующем пакете.

    }


}