package edu.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Classe de exemplo que demonstra o uso da interface funcional BinaryOperator
 * para somar os valores de uma lista de números inteiros.
 */
public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // BinaryOperator com expressão lambda para somar dois números
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usa o BinaryOperator para reduzir a lista a um único valor somando os números
        int resultado = numeros.stream()
            .reduce(0, somar);

        // Imprime o resultado da soma dos números
        System.out.println("A soma dos números é: " + resultado);
    }
}

