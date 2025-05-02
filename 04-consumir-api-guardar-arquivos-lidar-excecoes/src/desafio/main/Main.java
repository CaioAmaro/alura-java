package desafio.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import desafio.models.Cep;
import desafio.models.CepViaCep;
import desafio.services.HttpService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        List<Cep> cepsBuscados = new ArrayList<>();


        boolean erro = true;
        boolean continuar = true;
        while(erro || continuar){
            try{
                System.out.print("Digite um CEP: ");
                var json = HttpService.getCepInfo(input.next());
                CepViaCep cepViaCep = gson.fromJson(json, CepViaCep.class);

                if(cepViaCep.cep() == null){
                    throw new NoSuchElementException("Não foi encontrado na base de dados!");
                }

                Cep cep = new Cep(cepViaCep);
                cepsBuscados.add(cep);

                System.out.println("Você deseja continuar Pesquisando?");
                System.out.println("0 - Não | 1- Sim");
                System.out.print("R: ");
                if(input.nextInt() == 0){
                    continuar = false;
                    erro = false;
                }

                System.out.println("\n--------\n");

                FileWriter escrita = new FileWriter("cep.txt");
                escrita.write(gson.toJson(cepsBuscados));
                escrita.close();

                System.out.println("Ceps foram gravados com sucesso!");

            }catch (IllegalArgumentException | NoSuchElementException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
