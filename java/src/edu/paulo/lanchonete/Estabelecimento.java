package edu.paulo.lanchonete;

import edu.paulo.lanchonete.atendimento.Atendente;
import edu.paulo.lanchonete.atendimento.cozinha.Cozinheiro;
import edu.paulo.lanchonete.areacliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();

        atendente.receberPagamento();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
