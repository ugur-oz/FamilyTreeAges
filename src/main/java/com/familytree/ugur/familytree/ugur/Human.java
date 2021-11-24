package com.familytree.ugur.familytree.ugur;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private int age;
    private Human mother;
    private Human father;
    private List<Human> siblings = new ArrayList<>();

    public int getFamilyAge() {
        if (this.mother == null && this.father == null) {
            return this.age;
        } else if (this.mother != null && this.father == null) {
            if (this.getSiblings().size() > 0) {
                int siblingsAgeSum = 0;
                for (int i = 0; i < this.getSiblings().size(); i++) {
                    siblingsAgeSum += this.getSiblings().get(i).getAge();
                }
                return this.age + siblingsAgeSum;
            } else if (this.mother == null && this.father != null) {
                if (this.getSiblings().size() > 0) {
                    int siblingsAgeSum = 0;
                    for (int i = 0; i < this.getSiblings().size(); i++) {
                        siblingsAgeSum += this.getSiblings().get(i).getAge();
                    }
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }
//for loop a girmesen sifira eklersin ,
//    int i = 0  persons.get(i).getage

    /*else if(this.getSiblings().length > 0) {
                    int siblingsAgeSum = 0;
                    for (int i = 0; i < this.getSiblings().length; i++) {
                        siblingsAgeSum += this.getSiblings().get(i).getAge();
                    }
                    return this.age + siblingsAgeSum ;
                }*/
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
        this.name = name;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Human> getSiblings() {
        return siblings;
    }
}