package edu.paulo.firstproject;

public class user {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal atual :" + smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> TV Ligada ?" + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo status -> TV Ligada ?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual :" + smartTv.canal);


    }
    
}
