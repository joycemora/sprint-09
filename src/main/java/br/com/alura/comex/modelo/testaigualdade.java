package br.com.alura.comex.modelo;

public class testaigualdade {

    public static void main(String[] args) {

        produto celular1 = new produto("samsung a14");
        celular1.nome = "samsung a14";
        celular1.quantidade=10;
        celular1.descricao="celular novo samsung a14";
        celular1.precoUnitario=10.1;


        produto celular2 = new produto("samsung a14");
        celular2.nome = "samsung a14";
        celular2.quantidade=10;
        celular2.descricao="celular novo samsung a14";
        celular2.precoUnitario=10.1;


        if (celular1.equals(celular2)){
            System.out.println("É igual");


        }else System.out.println("Não é igual");


    }


}
