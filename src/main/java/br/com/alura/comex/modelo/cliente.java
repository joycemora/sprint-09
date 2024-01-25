package br.com.alura.comex.modelo;

import br.com.alura.comex.integracao.ViaCepResponse;
import br.com.alura.comex.integracao.ViaCepService;

public class cliente {

    private String nome;
    private String cpf;
    private String email;
    private String profissao;
    private String telefone;
    private endereco endereco;

    public cliente(String cpf, String email, String telefone, String nome, String profissao, endereco endereco) {
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
        this.profissao = profissao;
        this.endereco = endereco;


    }




    @Override
    public String toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", profissao='" + profissao + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco=" + endereco +
                '}';
    }


    public void setNome(String joyce) {
    }

    public void setendereco(br.com.alura.comex.modelo.endereco endereco) {
    }

    public void setProfissao(String programador) {
    }

    public void setCpf(String s) {
    }

    public void setTelefone(String s) {
    }

    public void setEmail(String mail) {
    }

    public void setEndereco(br.com.alura.comex.modelo.endereco endereco) {
    }
}




