package com.company;

public class InterfaceWithLambdas {

    public static void main(String[] args){

        PlaySound2 guitar = () ->
            System.out.println("Plays guitar sound");
                 guitar.play();

        PlaySound2 piano = () ->
            System.out.println("Plays piano sound");
                 piano.play();

        PlaySound2 violin = () ->
            System.out.println("Plays violin sound");
                 violin.play();

         SingSong singer = (String title) -> {//we can write without type of argument or brackets
             System.out.println("Sings: " + title);
         };
         singer.sing("Yellow submarine");

        SingSong1 singer2 = (String title, String artist) ->{//we can exclude type from both param, but must keep the brackets
            System.out.println("Singing: " + title + " from " + artist);
        };
        singer2.sing("My love", "Elton John");

        }
    }

    interface PlaySound2{
        public void play();
    }

    interface SingSong{
        public void sing(String title);
    }

    interface SingSong1{
        public void sing(String title, String Artist);
    }