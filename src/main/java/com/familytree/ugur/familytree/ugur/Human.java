package com.familytree.ugur.familytree.ugur;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String Name;
    private int age;
    private Human mother;
    private Human father;
    private List<Human> siblings = new ArrayList();

    public int getFamilyAge() {
        if (this.mother == null && this.father == null) {
            return this.siblings();
        }
        else if (this.mother != null && this.father == null) {
            for(int i=0;i<getSiblings().size();i++);
                return this.age + getSiblings().get(i).getAge();
        } else if (this.mother == null && this.father != null) {
            for(int i=0;i<getSiblings().size();i++);
            return this.age + getSiblings().get(i).getAge(); {

        }
    }
//for loop a girmesen sifira eklersin ,
//    int i = 0  persons.get(i).getage

    return 0;

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

    public List<Human> getSiblings() {
        return siblings;
    }

    public void setFather(Human father) {
        this.father = father;
    }

}
