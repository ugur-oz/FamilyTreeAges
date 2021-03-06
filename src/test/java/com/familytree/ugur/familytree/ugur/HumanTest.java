package com.familytree.ugur.familytree.ugur;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HumanTest {
    @Test
    void test1() {
        Human son = new Human("Ugur", 28);
        son.getSiblings().add(new Human("Ufuk",21));
        son.getSiblings().add(new Human("Atakan",5));
        son.getSiblings().add(new Human("Elif",18));
        son.getSiblings().add(new Human("Mehmet",34));
        son.getSiblings().add(new Human("Emine",48));

        Assertions.assertEquals(28, son.getAgeCounter());
        Assertions.assertEquals(5,son.getSiblings().size());
        Assertions.assertEquals("Atakan", son.getSiblings().get(1).getName());
        Assertions.assertEquals("Emine", son.getSiblings().get(4).getName());
        Assertions.assertEquals(34,son.getSiblings().get(3).getAge());
        Assertions.assertEquals(28+21+5+18+34+48,son.getFamilyAge());
    }

    @Test
    void test2() {
        Human son = new Human("Ugur", 28);
        Human mother = new Human("Emine", 45);
        Human gm = new Human("Hatice", 78);
        son.setMother(mother);
        mother.setMother(gm);

        son.getSiblings().add(new Human("Ufuk",24));
        son.getSiblings().add(new Human("Elif",18));

        mother.getSiblings().add(new Human("Emel",33));
        mother.getSiblings().add(new Human("Ali",54));
        mother.getSiblings().add(new Human("Uraz",48));
        mother.getSiblings().add(new Human("Kali",69));

        gm.getSiblings().add(new Human("Mahmut",80));
        gm.getSiblings().add(new Human("Ismail",89));
        gm.getSiblings().add(new Human("Leman",95));

        Assertions.assertEquals(2,son.getSiblings().size());
        Assertions.assertEquals(4,mother.getSiblings().size());
        Assertions.assertEquals(3,gm.getSiblings().size());



        Assertions.assertEquals(80+89+95+78,gm.getFamilyAge());
        Assertions.assertEquals(45+78+33+54+48+69+80+89+95,mother.getFamilyAge());
        Assertions.assertEquals(28+45+78+18+24+33+54+48+69+80+89+95,son.getFamilyAge());

        Assertions.assertEquals(28 + 45 + gm.getAge(), son.getAgeCounter());
    }

    @Test
    void test3() {
        Human son = new Human("Ugur", 28);
        Human father = new Human("Mehmet", 51);
        Human mother = new Human("Emine", 45);
        Human gm1 = new Human("Hatice", 78);
        Human gf1 = new Human("Mehmet", 92);
        Human gm2 = new Human("Dursun", 80);
        Human gf2 = new Human("Said", 85);

        son.setMother(mother);
        son.setFather(father);
        mother.setMother(gm1);
        mother.setFather(gf1);
        father.setFather(gf2);
        father.setMother(gm2);

        Assertions.assertEquals(28 + 51 + 45 + 78 + 92 + 80 + 85, son.getAgeCounter());
    }

    @Test
    void test4() {
        Human son = new Human("Ugur", 28);
        Human mother = new Human("Emine", 45);
        Human gm = new Human("Hatice", 78);
        Human ggm = new Human("Meryem", 121);
        Human ggf = new Human("Ismail", 125);

        son.setMother(mother);
        mother.setMother(gm);
        gm.setFather(ggf);
        gm.setMother(ggm);

        Assertions.assertEquals(28+45+78+121+125, son.getAgeCounter());
    }

    @Test
    void test5() {
        Human son = new Human("Ugur", 28);
        Human father = new Human("Mehmet", 51);
        Human mother = new Human("Emine", 45);

        son.setFather(father);
        son.setMother(mother);
        Assertions.assertEquals(28+51+45,son.getAgeCounter());
    }

    @Test
    void test7() {
        Human son = new Human("Ugur", 28);
        Human father = new Human("Mehmet", 51);
        Human gm = new Human("Dursun", 80);
        Human gf = new Human("Said", 85);
        Human ggf = new Human("Ismail", 125);
        Human gggf = new Human("Apo", 145);
        Human gggm = new Human("Leyla", 142);
        Human ggggf = new Human("B??y??k", 184);
        Human gggggm = new Human("B??y??kanne", 210);

        son.setFather(father);
        father.setMother(gm);
        father.setFather(gf);
        gf.setFather(ggf);
        ggf.setFather(gggf);
        ggf.setMother(gggm);
        gggm.setFather(ggggf);
        ggggf.setMother(gggggm);

        Assertions.assertEquals(28+51+80+85+125+145+142+184+210, son.getAgeCounter());
    }
}
