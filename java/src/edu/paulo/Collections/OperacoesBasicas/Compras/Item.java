package edu.paulo.Collections.OperacoesBasicas.Compras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item (String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantiade(){
        return quantidade;
    }
    public String toString(){
        return "Item{nome='" + this.nome + "', preco=" + this.preco + ", quant=" + this.quantidade + "}";
    }
}
