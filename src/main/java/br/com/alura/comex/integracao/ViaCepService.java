package br.com.alura.comex.integracao;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {
    public ViaCepResponse buscaCep(String cep)  {
        URI endereco = URI.create("https://viacep.com.br/ws/"+ cep +"/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = HttpClient.newBuilder()
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ViaCepResponse.class);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}

