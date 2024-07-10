package edu.paulo.secondweek;

public enum EstadoBrasileiro {
   SAO_PAULO ("SP", "SÃO PAULO" ,10),
   PERNAMBUCO("PE", "PERNAMUBCO", 11),
   PIAUI ("PI", "PIAUÍ", 12);

private String nome;
private String sigla;
private int ibge;

private EstadoBrasileiro( String sigla, String nome, int ibge){
    this.sigla = sigla;
    this.nome = nome;
    this.ibge = ibge;
}
public String getSigla(){
    return sigla;
}
public String getNome(){
    return nome;
}
public String getNomeMaiusculo(){
    return nome.toUpperCase();
}
public int getIbge(){
    return ibge;
}
}