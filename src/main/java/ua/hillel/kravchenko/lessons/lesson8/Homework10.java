package ua.hillel.kravchenko.lessons.lesson8;

import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {

        int x = 7;
        int[] lotteryChoose = new int[x];
        int[] userChoose = new int[x];
        int counter = 0;

        for (int i = 0; i < lotteryChoose.length; i++) {
            lotteryChoose[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < userChoose.length; i++) {
            userChoose[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(lotteryChoose);
        Arrays.sort(userChoose);

        System.out.println(Arrays.toString(lotteryChoose));
        System.out.println(Arrays.toString(userChoose));
        System.out.println();

        for (int i = 0; i < x; i++) {
            if(lotteryChoose[i] == userChoose[i]) {
                counter += 1;
                System.out.println("Збіги у комірці - " + (i + 1));
            }
        }
        System.out.println();
        System.out.println("Кількість збігів: " + counter);
    }
}
