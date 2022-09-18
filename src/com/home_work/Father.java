package com.home_work;

public class Father extends GrandFather {
    private String graduatedThatUniversity;

    public Father(int age, String name, BloodType bloodType, SchoolThatGraduated school,
                  String graduatedThatUniversity) {
        super(age, name, bloodType, school);
        this.graduatedThatUniversity = graduatedThatUniversity;
    }

    public String getGraduatedThatUniversity() {
        return graduatedThatUniversity;
    }

    //неперезаписываемый метод
    public void say() {
        System.out.println("My name is " + super.getName());
    }
    public final void say(String word) {
        System.out.println(word);
    }

    ;

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName of graduated University: " + graduatedThatUniversity +
                "\n";
    }
}
