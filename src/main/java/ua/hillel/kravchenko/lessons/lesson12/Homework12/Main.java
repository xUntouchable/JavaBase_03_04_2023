package ua.hillel.kravchenko.lessons.lesson12.Homework12;

public class Main {
    public static void main(String[] args) {
        Account dan = new Account("Dan", 13, 10, 1987, "alex@gmail.com", 975644325, "Dukalis", 91, 90, 9756);
        Account mykola = new Account("Mykola", 23, 3, 2000, "nikita@gmail.com", 786556544, "Sviridov", 84, 87, 13564);
        Account oleh = new Account("Oleh", 3, 9, 1996, "olha@gmail.com", 93546734, "Moiseenko", 52, 73, 18563);
        Account olexander = new Account("Olexander", 20, 8, 1967, "anna@gmail.com", 936776544, "Shab", 61, 78, 10454);
        Account iren = new Account("Iren", 1, 11, 2001, "kate@gmail.com", 637666657, "Kuznetsova", 56, 78, 23765);

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
