package br.com.alura.comex.modelo;



public class produto {

       public String nome;
       public String descricao;
       double precoUnitario;
       public int quantidade;

       public produto(String nome) {
              this.nome = nome;


       }

       @Override
       public String toString() {
              return ">> Dados do produto\n"+
                      ":: Nome: " +this.nome + "\n" +
                      ":: Descrição:" + this.descricao + "\n"+
                      ":: Quatidade:"+ this.quantidade + "\n"+
                      "::PrecoUnitario:"+ this.precoUnitario;
       }

}


