package ua.hillel.kravchenko.lessons.lesson6;

public class Homework8 {

    public static void main(String[] args) {
        int count = 0;
        for (int x = 1; ; x++){
            if((x == 4) || (x == 9) || (x / 10 == 4) || (x / 10 ==9) || (x % 10 == 4) || (x % 10 ==9) || (x / 100 == 4) || (x / 100 == 9) || (x % 100 ==4) || (x % 100 == 9) || ((x / 10) % 10 == 4) || ((x /10) % 10 == 9)){
                continue;
            }
            System.out.println("Номер шатла : " + x);
            count++;
            if(count == 100){
                break;
            }

        }
        System.out.println("Кол-во шатлов " + count );
    }
}
