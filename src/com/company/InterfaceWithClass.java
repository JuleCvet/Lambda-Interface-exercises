package com.company;

public class InterfaceWithClass {

    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        guitar.play();

        Piano piano = new Piano();
        piano.play();

        Violin violin = new Violin();
        violin.play();
    }
}

interface PlaySound{
    public void play();
}

class Guitar implements PlaySound {

    @Override
    public void play() {
        System.out.println("Plays guitar sound");
    }
}

class Piano implements PlaySound {

    @Override
    public void play() {
        System.out.println("Plays piano sound");
    }
}

class Violin implements PlaySound {

    @Override
    public void play() {
        System.out.println("Plays violin sound");
    }
}

