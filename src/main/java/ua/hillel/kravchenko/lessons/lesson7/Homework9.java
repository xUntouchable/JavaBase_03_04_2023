package ua.hillel.kravchenko.lessons.lesson7;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];

        for (int i = 0; i < 25 ; i++) {
            team1 [i] =  18 +(int)(Math.random() * 23);
            team2 [i] =  18 +(int)(Math.random() * 23);

        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));



        double avarage1 = 0;
        double avarage2 = 0;
        for (int i = 0; i < 25 ; i++) {
            avarage1 += team1[i];
            avarage2 += team2[i];

        }
        avarage1/=25;
        avarage2/=25;
        System.out.println("1st team = " + (int)avarage1);
        System.out.println("2nd team = " + (int)avarage2);


    }
}
