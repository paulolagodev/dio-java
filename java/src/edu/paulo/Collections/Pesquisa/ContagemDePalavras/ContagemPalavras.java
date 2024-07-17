package edu.paulo.Collections.Pesquisa.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contarPalavrasMap;

    public ContagemPalavras() {
        this.contarPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.contarPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contarPalavrasMap.isEmpty()) {
            this.contarPalavrasMap.remove(palavra);
        }
    }

    public int exibirContagemPalavras() {
        int contagem = 0;
        if (!contarPalavrasMap.isEmpty()) {
            for (int c : contarPalavrasMap.values()) {
                contagem += c;
            }
        }
        return contagem;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraFrequente = null;
        int maiorContagem = 0;
        if (!contarPalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contarPalavrasMap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    palavraFrequente = entry.getKey();
                }
            }
        }
        return palavraFrequente;
    }
}
