package br.com.alura.comex.modelo;

import java.util.ArrayList;
import java.util.Comparator;

public class lista {
    private ArrayList<pedido> listaPedido = new ArrayList<>();

    public void adicionarPedido(pedido pedido) {
        this.listaPedido.add(pedido);
    }

    public ArrayList<pedido> retornarLista() {
        return listaPedido;
    }
    public ArrayList<pedido> retonarListaOrdenada() {
        this.listaPedido.sort(Comparator.comparing(pedido::getValorTotal));
        return listaPedido;
    }

    public ArrayList<pedido> retornarListaOrnadaReversa() {
        this.listaPedido.sort(Comparator.comparing(pedido::getValorTotal).reversed());
        return listaPedido;
    }
}

