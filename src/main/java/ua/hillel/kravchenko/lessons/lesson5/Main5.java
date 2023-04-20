package ua.hillel.kravchenko.lessons.lesson5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {


//        int a = 5;
//        int b = 10;
//        int c = 15;


 //       boolean result = a < b && b < c; // && - и, если одно из условий false = Будет false (true
   //     System.out.println(result);

//        boolean result = a < b || b > c; // || - логический или(або) если одно из условий true = всегда будет true
//        System.out.println(result);

//        int a = 10;
//        int b = 20;

//        if (a > b){
//            System.out.println("a > b");
//        }

//        if (a > b){
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }


//        if (a > b){
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {                                // else if (a == b);
//            System.out.println("a == b");
//        }

//        int a = 30;
//        int b = 30;

//        if (a <= b){
//            System.out.println("a <= b");
//
//            if (a < b){
//                System.out.println("a < b");
//            } else{
//                System.out.println("a == b");
//            }
//
//        } else{
//            System.out.println("a > b");
//        }
                /// BAD CODE!!!!!!!!!!!!!!!!!
//        if (a != b)
//            System.out.println("QWERTY");
//            System.out.println("QWERTY");
//            System.out.println("QWERTY");
//            System.out.println("QWERTY");


//                ТЕРНАРНЫЙ ОПЕРАТОР
//        (Условие) ? выражение 1 : выражение 2 -> если ? выражение 1 иначе выражение 2

//        int a = 20;
//        int b = 30;
//
//        System.out.println((a > b)? "YES" : "NO");

//        int a = 3;
//
//        switch (a) {
//            case 1: {
//                System.out.println("1");
//
//            }
//            case 2: {
//                System.out.println("2");
//
//            }
//            case 3: {
//                System.out.println("3");
//                break;
//            }
//            case 4: {
//                System.out.println("4");
//
//            }
//            case 5: {
//                System.out.println("5");
//
//            }
//            default: {
//                System.out.println("default");
//                break;


//        String str = "QWE";
//
//        switch (str){
//            case "qwe": {
//                System.out.println("1");
//                break;
//            }case "Qwe": {
//                System.out.println("2");
//                break;
//            }case "QWe": {
//                System.out.println("3");
//                break;
//            }case "QWE": {
//                System.out.println("4");
//                break;
//
//            }
//        }
//        System.out.println((str.equalsIgnoreCase("qwe")));

        //SCANNER

//        Scanner sc = new Scanner(System.in);
//
//        String userValue = sc.nextLine();
//
//        System.out.println("userValue = " + userValue);
//
//        String userValue2 = sc.nextLine();
//
//        System.out.println("userValue2 = " + userValue2);


        Scanner sc1 = new Scanner(System.in);
        int x = 0;

      if (sc1.hasNextInt()){
          x = sc1.nextInt();
      } else {
          System.out.println("Wrong Data! Try again");
          System.exit(0);
      }


        System.out.println("uservalue = "+ x);




    }
        }

















