package br.com.alura.comex.integracao;

public class Gson {
    public ViaCepResponse fromJson(String body, Class<ViaCepResponse> viaCepResponseClass) {

        return new ViaCepResponse("08412000","rua otelo augusto ribeiro ","bloco 2 apartamento 24","Guaianases","sao paulo","sp");
    }
}
