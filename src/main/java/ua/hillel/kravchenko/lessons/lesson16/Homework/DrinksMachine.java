package ua.hillel.kravchenko.lessons.lesson16.Homework;

public enum DrinksMachine {
    COFFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    MINERAL_WATER("Мінеральна вода"),
    COCA_COLA("Кока-кола");

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
