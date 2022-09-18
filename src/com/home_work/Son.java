package com.home_work;

public final class Son extends Father {
    private String kindergarten;

    public Son(int age, String name, BloodType bloodType, SchoolThatGraduated school,
               String graduatedThatUniversity, String kindergarten) {
        super(age, name, bloodType, school, graduatedThatUniversity);
        this.kindergarten = kindergarten;
    }

    public String getKindergarten() {
        return kindergarten;
    }

    @Override
    public void say() {
        super.say("I\'m a son.");
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName of kindergarten: " + kindergarten;
    }
}
