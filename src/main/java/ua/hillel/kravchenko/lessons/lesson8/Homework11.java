package ua.hillel.kravchenko.lessons.lesson8;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = getNmbr(scanner);
        int m = getNmbr(scanner);

        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 51);
            }
        }
        System.out.println("First array:");
        printArray(array1);

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("Second array:");
        printArray(array2);

        scanner.close();


    }
    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int getNmbr(Scanner scanner) {
        int count = 0;
        System.out.println("Please enter array length");
        while (true) {
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                if (count < 0) {
                    System.out.println("Please enter right numbers");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, please try again!!");
                scanner.nextLine();
            }
        }
        return count;
}
}
