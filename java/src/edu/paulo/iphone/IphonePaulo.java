package edu.paulo.iphone;

public class IphonePaulo {
    public static void main(String[] args) {
        
        System.out.println("Safari");

        Safari safari = new Safari();
        safari.abrirApp();
        safari.buscar();

        System.out.println("Telefone");

        Telefone telefone = new Telefone();
        telefone.abrirApp();
        telefone.buscar();

        System.out.println("Ipod");

        Ipod ipod = new Ipod();
        ipod.abrirApp();
        ipod.buscar();
    }
}
