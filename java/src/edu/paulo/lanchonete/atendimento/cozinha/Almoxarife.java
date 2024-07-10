package edu.paulo.lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens");
    }
    private void controlarSaida(){
        System.out.println("Controlando saida dos itens");
    }
    void entregarIngredientes(){
        controlarEntrada();
        System.out.println("Entregando ingredientes");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("Almoxarife trocando o gas");
    }
}
