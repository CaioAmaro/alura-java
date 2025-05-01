package desafio.main;

import desafio.models.Musica;
import desafio.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        podcast.setTitulo("Como programar em java.");
        podcast.setHost("Caio Amaro");
        podcast.setDescricao("Tarefa de revisão POO");

        for(int i = 0; i < 5; i++){
            podcast.curte();
        }

        for(int i = 0; i < 5; i++){
            podcast.reproduz();
        }

        podcast.setClassificacao();

        System.out.println("*Podcast*");
        System.out.println("Titulo: " + podcast.getTitulo());
        System.out.println("Host: " + podcast.getHost());
        System.out.println("Descrição: " + podcast.getDescricao());
        System.out.println("------------");
        System.out.println("Curtidas: " + podcast.getTotalCurtidas());
        System.out.println("Reproduções: " + podcast.getTotalReproducoes());
        System.out.println("Classificação: " + podcast.getClassificacao());

        Musica musica = new Musica();
        musica.setTitulo("Reciclando conceitos básicos de poo");
        musica.setAlbum("Devs crazy");
        musica.setArtista("Caio Amaro");
        musica.setGenero("Pagode");

        for(int i = 0; i < 5; i++){
            musica.curte();
        }

        for(int i = 0; i < 5; i++){
            musica.reproduz();
        }

        musica.setClassificacao();

        System.out.println("\n");

        System.out.println("*Música*");
        System.out.println("Titulo: " + musica.getTitulo());
        System.out.println("Album: " + musica.getAlbum());
        System.out.println("Artista: " + musica.getArtista());
        System.out.println("Gênero: " + musica.getGenero());
        System.out.println("------------");
        System.out.println("Curtidas: " + musica.getTotalCurtidas());
        System.out.println("Reproduções: " + musica.getTotalReproducoes());
        System.out.println("Classificação: " + musica.getClassificacao());

    }
}
