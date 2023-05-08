package ua.hillel.kravchenko.lessons.lesson10;

public class Person {
    public static void main(String[] args) {

        personInfo("a.", "Will ", "Smith ", "New York", "3809379992");
        personInfo("b.", "Harry ", "Osborn ", "Los Angeles", "38099320022");
        personInfo("c.", "Frank ", "Hollister ", "Colorado", "38050230022");


    }
    static String personInfo(String f, String a, String b, String c, String d){
        System.out.println( f + " Зателефонувати громадянину : " + a + b + "із міста - " + c +"," + " можна за номером : " + d );
        return f + a + b + c +d;
    }


}
