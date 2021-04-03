package com.company;

import java.util.Random;
import java.math.*;

public class Main {
    //дз на сообразительность

    public static int generateRandomAge(){
        int a = (int) ( Math.random() * 100 );
        return a;
    }


    //дз

    public static void main(String[] args) {
        System.out.println(window(46, 14));
        System.out.println(window(25, 25));
        System.out.println(window(14,25));
        System.out.println(window(56,35));

        //дз на сообразительность
        System.out.println(generateRandomAge());
        System.out.println(window1( 14));
        System.out.println(window1( 25));
        System.out.println(window1(25));
        System.out.println(window1(35));

    }

    public static String window(int age, int temperature) {

        if (age >= 20 && age <= 45 && temperature > -20 && temperature <= 30) {
            return "можно идти гулять1";
        } else if (age < 20 && age >= 0 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять2";
        } else if (age > 45 && temperature >= 10 && temperature <= 25) {
                return "можно идти гулять3";
        }
        else
            return "Оставайтесь дома";
    }

    public static String window1( int temperature) {

        int age = (int) ( Math.random() * 100 );

        if (age >= 20 && age <= 45 && temperature > -20 && temperature <= 30) {
            return "можно идти гулять1";
        } else if (age < 20 && age >= 0 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять2";
        } else if (age > 45 && temperature >= 10 && temperature <= 25) {
            return "можно идти гулять3";
        }
        else
            return "Оставайтесь дома";
    }

}
