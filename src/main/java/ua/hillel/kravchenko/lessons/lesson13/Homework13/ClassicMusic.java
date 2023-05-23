package ua.hillel.kravchenko.lessons.lesson13.Homework13;

public class ClassicMusic extends MusicStyle {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " Play Classic Music!!");
    }

}
