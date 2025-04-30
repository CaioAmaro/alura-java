package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLacamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do em minutos: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Soma Avaliações: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        
        Serie lost = new Serie();
        
        lost.setNome("lost");
        lost.setAnoDeLacamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPortemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do em minutos: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLacamento(2023);
        outroFilme.setDuracaoEmMinutos(100);
        System.out.println("Duração do em minutos: " + meuFilme.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();

        System.out.println(meuFilme.getClassificao());
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);





    }
}
