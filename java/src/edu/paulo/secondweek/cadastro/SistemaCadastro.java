package edu.paulo.secondweek.cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123", "Marcos");

        marcos.setEndereco("Rua das marias");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf() + "-" + marcos.getEndereco());
    }
}
