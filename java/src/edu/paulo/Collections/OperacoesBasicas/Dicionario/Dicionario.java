package edu.paulo.Collections.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        }
    }

    public void exibirPalavra() {
        System.out.println(palavrasMap);
    }
    public String pesquisarPorPalavra( String palavra){
        String porPalavra = null;
        if(!palavrasMap.isEmpty()){
            porPalavra = palavrasMap.get(palavra);
        }
        return porPalavra;
    }
}
