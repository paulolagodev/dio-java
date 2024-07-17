package edu.StreamApi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Classe de exemplo que demonstra o uso da interface funcional Supplier
 * para gerar uma lista de saudações.
 */
public class SupplierExemplo {
    public static void main(String[] args) {
        // Supplier que fornece uma saudação
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo";

        // Gera uma lista de 5 saudações usando o Supplier
        List<String> listaSaudacoes = Stream.generate(saudacao)
            .limit(5)
            .collect(Collectors.toList());

        // Imprime cada saudação na lista
        listaSaudacoes.forEach(System.out::println);
    }
}
