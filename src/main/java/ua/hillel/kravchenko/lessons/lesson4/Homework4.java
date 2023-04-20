package ua.hillel.kravchenko.lessons.lesson4;

public class Homework4 {
    public static void main(String[] args) {

        int length = 13;
        int witdh = 16;
        int height = 21;

        int volume = length * witdh * height;

        System.out.println("Об'єм паралелепіпеда = " + volume);


        int length2 = (4*length) + (4*witdh) + (4*height);

        System.out.println("Сумарна довжина всіх сторін = " + length2);


    }
}
