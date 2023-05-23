package ua.hillel.kravchenko.lessons.lesson14.Homework14;

public class Iphones implements Smartphones, IOS{

    public Iphones(String name) {
        this.name = name;
    }

    public String name;
    @Override
    public void call() {
        System.out.println("Iphone calling!");

    }

    @Override
    public void sms() {
        System.out.println("Iphone sending sms");

    }

    @Override
    public void internet() {
        System.out.println("Iphone connecting to Internet");

    }

    @Override
    public void operationSystemIOS() {
        System.out.println("Iphone get MacOperationSystem");

    }
}
