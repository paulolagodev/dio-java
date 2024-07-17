package edu.paulo.Collections.Ordenacao.ordenarPessoas;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class OrdenacaoPessoa {
    private List <Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa( String nome, int idade, double altura){
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenadoPorIdade(){
        List <Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List <Pessoa> ordenadoPorAltura (){
        List <Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
          OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();
      
          // Adicionando pessoas à lista
          ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
          ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
          ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
          ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
      
          // Exibindo a lista de pessoas adicionadas
          System.out.println(ordenacaoPessoas.pessoaList);
      
          // Ordenando e exibindo por idade
          System.out.println(ordenacaoPessoas.ordenadoPorIdade());
      
          // Ordenando e exibindo por altura
          System.out.println(ordenacaoPessoas.ordenadoPorAltura());
        }
      }



