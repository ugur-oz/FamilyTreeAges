package com.familytree.ugur.familytree.ugur;

public class Human {
    private String Name;
    private int age;
    private Human mother;
    private Human father;


    public int getAgeCounter() {
        if (this.mother == null && this.father == null) {
            return this.age;
        } else if (this.mother != null && this.father != null) {
            return this.age + this.mother.getAgeCounter() + this.father.getAgeCounter();
        } else if (this.mother != null) {
            return this.age + this.mother.getAgeCounter();
        } else if (this.father != null) {
            return this.age + father.getAgeCounter();
        }
        return this.age + father.getAgeCounter();
    }


    public Human(String name, int age, Human mother, Human father) {
        Name = name;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }
}
