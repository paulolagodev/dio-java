package edu.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Classe de exemplo que demonstra o uso da interface funcional Predicate
 * para filtrar palavras de uma lista com mais de cinco caracteres.
 */
public class PredicateExemplo {
    public static void main(String[] args) {
        // Cria uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Predicate com expressão lambda para verificar se a palavra tem mais de cinco caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Filtra as palavras da lista que têm mais de cinco caracteres e as imprime
        palavras.stream()
            .filter(maisDeCincoCaracteres)
            .forEach(System.out::println);
    }
}

