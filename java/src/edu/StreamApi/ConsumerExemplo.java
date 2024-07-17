package edu.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Classe de exemplo que demonstra o uso da interface funcional Consumer
 * para processar e imprimir números pares de uma lista.
 */
public class ConsumerExemplo {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usando o Consumer para imprimir os números pares
        numeros.forEach(imprimirNumeroPar);

        // Outra forma de imprimir números pares diretamente dentro do forEach
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
