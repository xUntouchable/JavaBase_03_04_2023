package ua.hillel.kravchenko.lessons.lesson12.Homework12;

public class Main {
    public static void main(String[] args) {
        Account dan = new Account("Dan", 13, 10, 1989, "dan2@gmail.com", 975644325, "Dukalis", 91, 90, 8765);
        Account mykola = new Account("Mykola", 23, 3, 1999, "mykola43@gmail.com", 786556544, "Sviridov", 84, 87, 12875);
        Account oleh = new Account("Oleh", 3, 9, 1994, "oleh99@gmail.com", 93546734, "Moiseenko", 52, 73, 17543);
        Account olexander = new Account("Olexander", 20, 8, 1965, "olexander98@gmail.com", 936776544, "Shab", 61, 78, 11432);
        Account iren = new Account("Iren", 1, 11, 2000, "irengo@gmail.com", 637666657, "Kuznetsova", 56, 78, 23888);

        dan.printAccountInfo();
        System.out.println();
        mykola.printAccountInfo();
        System.out.println();
        oleh.printAccountInfo();
        System.out.println();
        olexander.printAccountInfo();
        System.out.println();
        iren.printAccountInfo();
        System.out.println();

        olexander.setSurname("Sergeev");
        olexander.setWeight(75);
        olexander.printAccountInfo();
        olexander.setPressure(80);
        System.out.println();

        oleh.setWeight(73);
        oleh.setAmountSteps(23656);
        oleh.setPressure(70);
        oleh.printAccountInfo();
    }
}
