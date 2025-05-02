package desafio.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpService {

    public static String getCepInfo(String cep) throws IOException, InterruptedException {

        var cepVerificado = verificarCep(cep);
        String uri = "https://viacep.com.br/ws/"+cepVerificado+"/json/";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    private static String verificarCep(String cep){

        String cepVerificado = cep;

        if(cepVerificado.contains("-")){
            cepVerificado = cepVerificado.replace("-","");
        }

        if(cepVerificado.isEmpty()){
            throw new IllegalArgumentException("CEP Inválido! - Argumento passado está vazio!");
        }

        if(cepVerificado.length() > 8){
            throw new IllegalArgumentException("CEP Inválido! - Existe algarismo a mais.");
        }

        if(cep.length() < 8){
            throw new IllegalArgumentException("CEP Inválido! - Existe algarismo a menos.");
        }

        return cepVerificado;

    }
}
