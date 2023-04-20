package ua.hillel.kravchenko.lessons.lesson5;

public class Homework5 {
    public static void main(String[] args) {

        int li1 = 13;
        int li2 = 24;
        int li3 = 46;

        int army = 860;

        int sumLi = army * (li1 + li2 + li3);
        System.out.println("Sum army damage = " + sumLi);

        int min1 = 9;
        int min2 = 35;
        int min3 = 12;

        double army2 = army * 1.5;

        int sumMin = (int)army2 *(min1 + min2 + min3);
        System.out.println("Sum army damage = " + sumMin);


    }
}
