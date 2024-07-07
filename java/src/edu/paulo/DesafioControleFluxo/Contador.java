package edu.paulo.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
       int num1 = scanner.nextInt();

        System.out.println("Informe outro numero: ");
       int num2 = scanner.nextInt(); 

       try{
        contar(num1, num2);
       } catch( ParametroInvalidosException exception){
        System.out.println(exception.getMessage());
       }
       scanner.close();
    }
    static void contar( int num1, int num2 ) throws ParametroInvalidosException {

        if(num1>num2){
            throw new ParametroInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int iteracoes = num2 - num1;

        for( int i=1; i<iteracoes; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
