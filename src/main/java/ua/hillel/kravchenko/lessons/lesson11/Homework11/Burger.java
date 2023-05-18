package ua.hillel.kravchenko.lessons.lesson11.Homework11;

public class Burger {

    String bun;
    String meat1;
    String meat2;
    String cheese;
    String salad;
    String mayo;

    public Burger(String bun, String meat1, String cheese, String salad, String mayo) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.salad = salad;
        this.mayo = mayo;
        System.out.println("Original Burger : " + bun +  meat1 +  cheese +  salad +  mayo);

    }

    public Burger(String bun, String meat1, String cheese, String salad) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.salad = salad;
        System.out.println("Burger without Mayo : " + bun +  meat1 +  cheese +  salad);
    }

    public Burger(String bun, String meat1, String meat2, String cheese, String salad, String mayo) {
        this.bun = bun;
        this.meat1 = meat1;
        this.meat2 = meat2;
        this.cheese = cheese;
        this.salad = salad;
        this.mayo = mayo;
        System.out.println("Double Meat Burger : " + bun + meat1 + meat2 + cheese + salad + mayo);
    }

}
