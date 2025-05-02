package br.com.screenmatch.main;

import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);
        var busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!busca.equalsIgnoreCase("sair")) {
            System.out.print("Digite um filme para busca: ");

            busca = input.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "http://www.omdbapi.com/?apikey=afd46234&t=" + busca;

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println(response.body());
                String json = response.body();


                //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                //try{
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo Convertido");

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro:");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de Argumento na Busca");
            } catch (Exception e) {
                System.out.println("Aconteceu algo, não sei o que");
            }

            System.out.println(titulos);

            FileWriter escrita = new FileWriter("filmes.txt");
            escrita.write(gson.toJson(titulos));
            escrita.close();

            System.out.println("O programa finalizou corretamente!");

        }
    }
}
