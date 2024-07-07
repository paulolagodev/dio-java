package edu.paulo.firstweek;

import java.util.Scanner;

public class CalculadorDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alunos[] = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaturma(alunos, scanner);

        System.out.println(media);
    }
    static double calculaMediaDaturma ( String[] alunos, Scanner scanner){
        double soma = 0; 
        for ( String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
