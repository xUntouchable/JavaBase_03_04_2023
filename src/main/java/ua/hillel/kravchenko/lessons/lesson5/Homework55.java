package ua.hillel.kravchenko.lessons.lesson5;

import java.util.Scanner;

public class Homework55 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Please Enter 1st Team name");

        String teamName1 = sc.nextLine();

        System.out.println("1st Team Name = " + teamName1);

        System.out.println("Please Enter Frags");
        Scanner sc1 = new Scanner(System.in);

        int x1 = 0;

        if (sc1.hasNextInt()){
            x1 = sc1.nextInt();
            System.out.println("1stplayer = " + x1);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);

        }

        int x2 = 0;

        if (sc1.hasNextInt()){
            x2 = sc1.nextInt();
            System.out.println("2stplayer = " + x2);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        int x3 = 0;

        if (sc1.hasNextInt()){
            x3 = sc1.nextInt();
            System.out.println("3stplayer = " + x3);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        int x4 = 0;

        if (sc1.hasNextInt()){
            x4 = sc1.nextInt();
            System.out.println("4stplayer = " + x4);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        int x5 = 0;

        if (sc1.hasNextInt()){
            x5 = sc1.nextInt();
            System.out.println("5stplayer = " + x5);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);

        }
        sc1.nextLine();

        System.out.println("Please Enter 2nd Team Name");
        String secondteamname = sc.nextLine();


        System.out.println("2nd Team Name = " + secondteamname);

        System.out.println("Please Enter Frags");

        int x6 = 0;

        if (sc1.hasNextInt()){
            x6 = sc1.nextInt();
            System.out.println("6stplayer = " + x6);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        int x7 = 0;

        if (sc1.hasNextInt()){
            x7 = sc1.nextInt();
            System.out.println("7stplayer = " + x7);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        int x8 = 0;

        if (sc1.hasNextInt()){
            x8 = sc1.nextInt();
            System.out.println("8stplayer = " + x8);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        int x9 = 0;

        if (sc1.hasNextInt()){
            x9 = sc1.nextInt();
            System.out.println("9stplayer = " + x9);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        int x10 = 0;

        if (sc1.hasNextInt()){
            x10 = sc1.nextInt();
            System.out.println("10stplayer = " + x10);
        } else {
            System.out.println("Wrong, try again!");
            System.exit(0);
        }

        int sum1 = (x1+x2+x3+x4+x5)/5;

        System.out.println("sum 1st team = " + sum1);

        int sum2 = (x6+x7+x8+x9+x10)/5;

        System.out.println("sum 2nd team = " + sum2 );

        if(sum1 > sum2){
            System.out.println("Перемогла команда Blue " + " набрала = " + sum1 );
        } else if(sum1 < sum2){
            System.out.println("Перемогла команда Red " + " набрала = " + sum2);
        }
        if (sum1 == sum2){
            System.out.println("Draw!!");
        }



    }
}
