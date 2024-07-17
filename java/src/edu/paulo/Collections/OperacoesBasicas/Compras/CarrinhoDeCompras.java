package edu.paulo.Collections.OperacoesBasicas.Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> removerItems = new ArrayList<>();

        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                removerItems.add(i);
            }
        }
        itemList.removeAll(removerItems);
    }
    public double calcularValorTotal(){
        double valorTotal = 0.0;

        for(Item i: itemList){
            valorTotal += i.getPreco() *i.getQuantiade();
        }
        return valorTotal;
    }
    public void exibirItens(){
        for (Item i : itemList) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarItem("Item 1", 10, 1);
    carrinho.adicionarItem("Item 2", 20, 2);
    carrinho.adicionarItem("Item 3", 5.0, 3);

    System.out.println("Itens no carrinho");
    carrinho.exibirItens();

    System.out.println("Valor Total: " + carrinho.calcularValorTotal());

    carrinho.removerItem("Item 2");

    System.out.println("Itens após remoção: ");
    carrinho.exibirItens();

    System.out.println("Valor total após remoção: " + carrinho.calcularValorTotal());
    }
}
