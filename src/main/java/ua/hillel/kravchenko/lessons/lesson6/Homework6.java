package ua.hillel.kravchenko.lessons.lesson6;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {


        int random = (int) (Math.random() *11);
        System.out.println("Начинаем игру, у Вас 3 попытки угадать число");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 2; ++i) {
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                if (number == random) {
                    System.out.println("Вы угадали число : " + number + " >> Кол-во попыток : " + (i+1));
                    break;
                } else if (number > random) {
                    System.out.println("Ваше число больше");
                } else {
                    System.out.println("Ваше число меньше");
                }
            } else{
                System.out.println("Ошибка, введите число");
                scanner.nextLine();
                i--;
            }
            if (i == 2){
                System.out.println("Вы проиграли!");
            }
            }


        }





            }





