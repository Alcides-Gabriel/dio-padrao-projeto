package desafio_padrao_projeto.aplicacao;

import desafio_padrao_projeto.cozinha.Pedido;

public class Programa {

    public static void main(String[] args) {
        Pedido pedido1 = Pedido.obterInstancia();
        pedido1.setPrato("Pizza de Calabresa");

        Pedido pedido2 = Pedido.obterInstancia();

        System.out.println("Pedido 1: " + pedido1.getPrato());
        System.out.println("Pedido 2: " + pedido2.getPrato());
    }
}
