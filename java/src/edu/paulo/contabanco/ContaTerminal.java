package edu.paulo.contabanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Banco do Paulão");

        System.out.println("Insira o seu nome: ");
        String NomeCliente = scanner.next();

        System.out.println("Insira o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Insira o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Insira o saldo disponível na sua conta bancária: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + "," + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta " + numero + "," + "  seu saldo " + saldo + " já está dispónível para saque.");
        

        scanner.close();
    }
}
