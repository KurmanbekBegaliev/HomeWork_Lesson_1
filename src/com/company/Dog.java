package com.company;

import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog(String name, String breed, String[] commands, EnumColor color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, EnumColor color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);

    }

    public Dog() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public static void makeVoice() {
        System.out.println("guv guv");
    }

    public static void makeVoice(String voice) {
        System.out.println(voice);
    }

    public static void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            voice += " ";
            voice += voice;
        }
        System.out.println(voice);
    }

    public final String getInfo() {
        return "Name: " + name +"\n" +
                super.getInfo() +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commands) +
                "\n";
     }


}
