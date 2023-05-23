package ua.hillel.kravchenko.lessons.lesson14;

import ua.hillel.kravchenko.lessons.lesson14.Homework14.Android;
import ua.hillel.kravchenko.lessons.lesson14.Homework14.Iphones;

public class Main {
    public static void main(String[] args) {

//        Iphones iphone = new Iphones("Iphone 14");
//        Android android = new Android("Samsung");
//
//
//        iphone.sms();
//        iphone.call();
//        iphone.internet();
//        iphone.operationSystemIOS();
//
//        android.sms();
//        android.call();
//        android.internet();
//        android.operationSystem();

        Iphones[] iphones = {
                new Iphones("Iphone 14")
        };
        for (Iphones iphones1 : iphones){
            iphones1.call();
            iphones1.sms();
            iphones1.internet();
            iphones1.operationSystemIOS();
        }

        System.out.println();

        Android[] androids = {
                new Android("Samsung")
        };

        for (Android androids1 : androids){
            androids1.call();
            androids1.sms();
            androids1.internet();
            androids1.operationSystem();
        }
    }
}
