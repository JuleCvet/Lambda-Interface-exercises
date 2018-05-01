package com.company;

public class InterfaceWithAnonymousClass {

    public static void main(String[] args) {

        PlaySound1 guitar = new PlaySound1() {
            @Override
            public void play() {
                System.out.println("Plays guitar sound");
                }
            };


        SingAsong singer = new SingAsong(){
            @Override
            public void sing(String str) {
                System.out.println("Sings" + str);
            }
        };
        guitar.play();
        singer.sing("Yellow submarine");


        PlaySound1 piano = new PlaySound1() {
            @Override
            public void play() {
                System.out.println("Plays piano sound");
            }
        };
        piano.play();

        PlaySound1 violin = new PlaySound1() {
            @Override
            public void play() {
                System.out.println("Plays violin sound");
            }
        };
        violin.play();
    }
}

interface PlaySound1{
    public void play();
}

interface SingAsong{
    public void sing(String title);

}