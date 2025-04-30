package desafio.main;

import desafio.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        podcast.setTitulo("Como programar em java.");
        podcast.setHost("Caio Amaro");
        podcast.setDescricao("Tarefa de revisão POO");

        for(int i = 0; i < 300; i++){
            podcast.curte();
        }

        for(int i = 0; i < 500; i++){
            podcast.reproduz();
        }

        podcast.setClassificacao();

        System.out.println("Titulo: " + podcast.getTitulo());
        System.out.println("Host: " + podcast.getHost());
        System.out.println("Descrição: " + podcast.getDescricao());
        System.out.println("------------");
        System.out.println("Curtidas: " + podcast.getTotalCurtidas());
        System.out.println("Reproduções: " + podcast.getTotalReproducoes());
        System.out.println("Classificação: " + podcast.getClassificacao());
    }
}
