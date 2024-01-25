package br.com.alura.comex.modelo;

import br.com.alura.comex.integracao.ViaCepResponse;
import br.com.alura.comex.integracao.ViaCepService;

public class endereco {
   String bairro;
    String cidade ;
   String complemento;
   String estado;
      String rua;
     int numero;
     public endereco(String rua, int numero,String bairro,String cidade, String estado,String complemento){
         this.rua=rua;
         this.numero=numero;
         this.bairro=bairro;
         this.cidade=cidade;
         this.estado=estado;
         this.complemento=complemento;
     }



        @Override
        public String toString () {
            return "endereco{" +
                    "bairro='" + bairro + '\'' +
                    ", cidade='" + cidade + '\'' +
                    ", complemento='" + complemento + '\'' +
                    ", estado='" + estado + '\'' +
                    ", rua='" + rua + '\'' +
                    ", numero=" + numero +
                    '}';
        }
    }
