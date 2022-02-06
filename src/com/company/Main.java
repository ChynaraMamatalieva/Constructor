package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Class klass = new Class(188,"mashina", new int[] {1, 9, 6, -2, 12});
        System.out.println(klass.getNumber()+" "+klass.getWord()+" "+ Arrays.toString(klass.getArray()));









        //Rectangle rect = new Rectangle(5,8);
        //System.out.println(rect.getA()+" "+rect.getB());


//        Kurs kurs = new Kurs("Java", 5,"Muhammed Allanov","04.01.2022");
//        System.out.println(kurs.getName()+" "+kurs.getNumber()+" "+kurs.getTeachersName()+" "+kurs.getDate());
//
//        Strudent strudent = new Strudent(30041988,"Chynara","Mamatalieva", (byte) 18);
//        System.out.println(strudent.getStName()+" "+strudent.getStSurname()+" "+strudent.getAge()+" "+strudent.getDateOfbirth());
    }
}
