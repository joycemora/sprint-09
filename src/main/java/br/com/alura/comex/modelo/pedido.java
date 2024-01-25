package br.com.alura.comex.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class pedido {

    int id;
    cliente cliente;
    BigDecimal preco;
    int quantidade;

    LocalDateTime data;

    public pedido(BigDecimal preco,int id,cliente cliente,LocalDateTime data ) {
        this.preco=preco;
        this.id=id;
        this.cliente=cliente;
        this.data=data;
    }

    public pedido(double valor, int id, String joyce, String s) {
    }

    public pedido(double valor, int id, br.com.alura.comex.modelo.cliente cliente, int data) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public cliente getCliente() {
        return cliente;
    }

    public BigDecimal getPreco() {
        return setPreco(new BigDecimal("120.00"));
    }

    public BigDecimal setPreco(BigDecimal bigDecimal) {
        this.preco = preco;
        return null;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getData() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = null;
        String dataFormatada = data.format(String.valueOf(formatador));
        return dataFormatada;
    }

    public <localDateTime> void setData(localDateTime data) {

        this.data = (LocalDateTime) data;
    }
    public boolean isMaisBaratoQue(pedido outroPedido) {
        if(this.getValorTotal().compareTo(outroPedido.getValorTotal()) == -1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isMaisCaroQue(pedido outroPedido) {
        if(this.getValorTotal().compareTo(outroPedido.getValorTotal()) == 1) {
            return true;
        }else{
            return false;
        }
    }

    public BigDecimal getValorTotal() {
        return this.preco.multiply(new BigDecimal(this.getQuantidade())) ;
    }
    @Override
    public String toString() {
        return ">>> Dados do pedido: \n" +
                "ID: " + getId() + "\n" +
                "Cliente: " + cliente.getClass() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "Data: " + getData() + "\n" +
                "Valor total: " + getValorTotal() + "\n" +
                "-------------------------------------------- \n";

    }

    public void setCliente(br.com.alura.comex.modelo.cliente cliente) {
    }
}

