public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screem Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLacamento = 2022;
        System.out.println("Ano de Lançamento " + anoDeLacamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;

        /*
        * Isso aqui é um comentário em bloco.
        * */

        //Média Calculada
        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(media);

        String sinopse;

        sinopse = """
                Filme Top Gun
                Filme de Aventura com galâ dos anos 80
                Muito Bom!
                Ano de lançamento
                """ + anoDeLacamento;

        System.out.println(sinopse);

        int classificacao =  (int) media/2; //Cast

        System.out.println(classificacao);
    }
}
