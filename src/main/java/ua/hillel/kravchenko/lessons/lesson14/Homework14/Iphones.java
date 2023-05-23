package ua.hillel.kravchenko.lessons.lesson14.Homework14;

public class Iphones implements Smartphones, IOS{

    public Iphones(String name) {
        this.name = name;
    }

    public String name;

    public String getName(){
        return name;
    }
    @Override
    public void call() {
        System.out.println(getName() + " : Iphone calling!");

    }

    @Override
    public void sms() {
        System.out.println(getName() + " : Iphone sending sms");

    }

    @Override
    public void internet() {
        System.out.println(getName() + " : Iphone connecting to Internet");

    }

    @Override
    public void operationSystemIOS() {
        System.out.println(getName() + " : Iphone get MacOperationSystem");

    }
}
