package edu.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Classe de exemplo que demonstra o uso da interface funcional Function
 * para dobrar os valores de uma lista de números inteiros.
 */
public class FunctionExemplo {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Function com expressão lambda para dobrar os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Aplica a função de dobrar a cada número da lista e coleta em uma nova lista
        List<Integer> numerosDobrados = numeros.stream()
            .map(dobrar)
            .collect(Collectors.toList());

        // Imprime cada número dobrado na lista
        numerosDobrados.forEach(System.out::println);
    }
}
