package ua.hillel.kravchenko.lessons.lesson13.Homework13;

public abstract class MusicStyle {
    private String name;

    public MusicStyle(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void playMusic();
    }

