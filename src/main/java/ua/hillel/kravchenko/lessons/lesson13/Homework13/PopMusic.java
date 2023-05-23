package ua.hillel.kravchenko.lessons.lesson13.Homework13;

public class PopMusic extends MusicStyle{
    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " Play Pop Music!!");
    }
}
