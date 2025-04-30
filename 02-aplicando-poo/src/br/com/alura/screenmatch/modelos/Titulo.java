package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLacamento;
    private boolean incluidoNoPLano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

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
}
