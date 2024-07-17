package edu.paulo.Collections.OperacoesBasicas.Tarefa;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa (String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public String toString(){
        return descricao;
    }
}
