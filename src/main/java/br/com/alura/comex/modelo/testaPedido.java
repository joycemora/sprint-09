package br.com.alura.comex.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class testaPedido {
    public static void main(String[] args) {
        // Produto

        produto produto = new produto("Celular S20");
        produto.descricao = "Celular preto";
        produto.precoUnitario = 1000.00;
        produto.quantidade = 10;

        // Endereço
        endereco endereco = new endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sao paulo","bloco 2 apartamento 24");
        endereco.bairro = "guaianases";
        endereco.cidade = "sao paulo";
        endereco.rua = "otelo augusto ribeiro";
        endereco.complemento = "bloco 2 apartamento 24 ";
        endereco.estado = "sao paulo";
        endereco.numero = 1676;

        // Cliente

        cliente cliente = new cliente("568.676.564-98","joyce@gmail.com","3434-5655","joyce","programador",new endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sao paulo","bloco 2 apartamento 24"));
        cliente.setNome("joyce");
        cliente.setEmail("joyce@gmail.com");
        cliente.setTelefone("(99) 99999-9999");
        cliente.setCpf("999.999.999-99");
        cliente.setProfissao("programador");
        cliente.setendereco(endereco);

        // Pedido

        pedido camisa = new pedido(10.90,45,new cliente("545.675.977-98","joyce@gmail.com","23232-87997","joyce","programador",new endereco("otelo augusto ribeito",1676,"guaianases","sao paulo","sp","bloco 2 apartamento 24")),10/ 3 /2024);
        camisa.setId(1);
        camisa.setCliente(cliente);
        camisa.setPreco(new BigDecimal("10.30"));
        camisa.setQuantidade(5);
        camisa.setData(LocalDateTime.now());
        System.out.println(camisa.toString());


        pedido calca = new pedido(10.90,45,new cliente("435.768.877-65","joyce@gmail.com","23423-6465","joyce","programador",new endereco("otelo augusto ribeiro",1676,"guaianases","sao paulo","sp","bloco 2 apartamento 24")),10/ 3/656);
        calca.setId(2);
        calca.setCliente(cliente);
        calca.setPreco(new BigDecimal("82.00"));
        calca.setQuantidade(2);
        calca.setData(LocalDateTime.now());

        System.out.println(calca.toString());

        pedido calcado = new pedido(10.90,4564545,"joyce","10/43/656");
        calcado.setId(3);
        calcado.setCliente(cliente);
        calcado.setPreco(new BigDecimal("120.00"));
        calcado.setQuantidade(1);
        calcado.setData(LocalDateTime.now());
        System.out.println(calcado.toString());
    }
}

