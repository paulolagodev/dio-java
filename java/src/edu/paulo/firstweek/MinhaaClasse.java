package edu.paulo.firstweek;

import java.util.Scanner;

public class MinhaaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a seu Nome: ");
        String nome = scanner.next();

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Sua apresentação:");
        System.out.println("Olá! Me chamo " + nome);
        System.out.println("Tenho " + idade  + " anos");
        System.out.println("Possuo " + altura + " de altura");

        scanner.close();
    }
}
