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
        //son.getSiblings().add(new Human("Elif",18));

        mother.getSiblings().add(new Human("Emel",33));
        //mother.getSiblings().add(new Human("Ali",54));
        //mother.getSiblings().add(new Human("Uraz",48));
        //mother.getSiblings().add(new Human("Kali",69));

        gm.getSiblings().add(new Human("Mahmut",80));
        //gm.getSiblings().add(new Human("Ismail",89));
        //gm.getSiblings().add(new Human("Leman",95));

        /*Assertions.assertEquals(2,son.getSiblings().size());
        Assertions.assertEquals(4,mother.getSiblings().size());
        Assertions.assertEquals(3,gm.getSiblings().size());

         */

        //Assertions.assertEquals(78+24+28+45,gm.getFamilyAge());
        //Assertions.assertEquals(28,mother.getFamilyAge());
        Assertions.assertEquals(28+45+78+24+33+80,son.getFamilyAge());

        //Assertions.assertEquals(28 + 45 + gm.getAge(), son.getAgeCounter());
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
        Human ggggf = new Human("Büyük", 184);
        Human gggggm = new Human("Büyükanne", 210);

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
    @Test
    void testFive() {
        Human greatGreatGreatGreatGrandMother1 = new Human("Georg", 55 , null, null);
        Human greatGreatGreatGrandFather1 = new Human("Georg",90 , greatGreatGreatGreatGrandMother1, null);
        Human greatGreatGrandMother1 = new Human("Hanne", 70, null, greatGreatGreatGrandFather1);

        greatGreatGrandMother1.getSiblings().add(new Human("bruder1",30 , null, null));
        greatGreatGrandMother1.getSiblings().add(new Human("bruder2", 35, null, null));

        Human greatGrandFather1 = new Human("Georg", 55, greatGreatGrandMother1, null);
        Human greatGrandMother1 = new Human("Jana", 56, null, null);
        Human grandMother1 = new Human("grandle", 45, null, null);

        grandMother1.getSiblings().add(new Human("bruder1", 30, null, null));
        grandMother1.getSiblings().add(new Human("bruder2", 35, null, null));

        Human grandFather1 = new Human("gusti", 46, null, null);
        Human grandFather2 = new Human("hansle", 44, greatGrandMother1, greatGrandFather1);
        Human grandMother2 = new Human("sii", 47, null, null);

        Human mother = new Human("Hildie", 30, grandMother1, grandFather1);
        mother.getSiblings().add(new Human("bruder1", 30, null, null));
        mother.getSiblings().add(new Human("bruder2", 35, null, null));

        Human father = new Human("Peter", 31, grandMother2, grandFather2);

        father.getSiblings().add(new Human("bruder1", 30, null, null));
        father.getSiblings().add(new Human("bruder2", 35, null, null));

        Human son = new Human("Matthias", 15, mother, father);
        Assertions.assertEquals(55 + 90 + 70 + 30 + 35 + 55 + 56 + 45 + 30 + 35 + 46 + 44 + 47 + 30 + 30 + 35 + 31 + 30 + 35 + 15, son.getFamilyAge());
    }
}
