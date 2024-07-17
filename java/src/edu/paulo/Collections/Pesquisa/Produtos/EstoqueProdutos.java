package edu.paulo.Collections.Pesquisa.Produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0.0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
            return valorTotalEstoque;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() > maiorValor) {
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

}
