package br.com.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLacamento;
    private boolean incluidoNoPLano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(TituloOmdb meuTituloOmdb){
        this.nome = meuTituloOmdb.title();
        this.anoDeLacamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public Titulo(String nome, int anoDeLacamento) {
        this.nome = nome;
        this.anoDeLacamento = anoDeLacamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLacamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLacamento() {
        return anoDeLacamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLacamento(int anoDeLacamento) {
        this.anoDeLacamento = anoDeLacamento;
    }

    public void setIncluidoNoPLano(boolean incluidoNoPLano) {
        this.incluidoNoPLano = incluidoNoPLano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "(Nome: " + this.nome + ", " +
                "Ano de Lançamento: " + this.anoDeLacamento + ", " +
                "Duração: " + this.duracaoEmMinutos + ")";
    }


}
