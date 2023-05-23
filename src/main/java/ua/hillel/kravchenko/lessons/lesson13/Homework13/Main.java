package ua.hillel.kravchenko.lessons.lesson13.Homework13;

public class Main {
    public static void main(String[] args) {

//        ClassicMusic classicMusic = new ClassicMusic("Mozart : ");
//        RockMusic rockMusic = new RockMusic("Queen : ");
//        PopMusic popMusic = new PopMusic("Viagra : ");

        MusicStyle[] groups = {
                new ClassicMusic("Mozart :"),
                new RockMusic("Queen :"),
                new PopMusic("Viagra :"),
        };

        for (MusicStyle musicStyle : groups){
            musicStyle.playMusic();
        }

    }
}
