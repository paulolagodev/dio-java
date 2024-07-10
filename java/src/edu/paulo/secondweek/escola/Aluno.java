package edu.paulo.secondweek.escola;

public class Aluno {
    private String nome;
    private int idade;
    private String sexo;

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String newSexo){
        this.sexo = newSexo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }
}

