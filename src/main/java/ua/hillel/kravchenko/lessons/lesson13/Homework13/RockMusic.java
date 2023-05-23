package ua.hillel.kravchenko.lessons.lesson13.Homework13;

public class RockMusic extends MusicStyle {
    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " Play Rock Music!!");
    }
}
