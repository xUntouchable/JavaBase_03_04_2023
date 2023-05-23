package ua.hillel.kravchenko.lessons.lesson14.Homework14;

public class Android implements Smartphones, LinuxOS{

    public Android(String name) {
        this.name = name;
    }

    public String name;

    @Override
    public void call() {
        System.out.println("Android calling!");



    }

    @Override
    public void sms() {
        System.out.println("Android sending sms");

    }

    @Override
    public void internet() {
        System.out.println("Android connecting to Internet");


    }

    @Override
    public void operationSystem() {
        System.out.println("Android get LinuxOperationSystem");


    }
}
