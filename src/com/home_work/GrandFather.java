package com.home_work;

public class GrandFather {
    private int age;
    private String name;
    private BloodType bloodType;
    private SchoolThatGraduated school;


    public GrandFather(int age, String name, BloodType bloodType, SchoolThatGraduated school) {
        this.age = age;
        this.name = name;
        this.bloodType = bloodType;
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public SchoolThatGraduated getSchool() {
        return school;
    }

    public String getInfo() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nBlood type: " + bloodType +
                "\nSchool number: " + school.getSchoolNumber() +
                "\nSchool name: " + school.getSchoolName();
    }
}
