package curso;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lancamento? ");
        int anoDeLacamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLacamento);
        System.out.println(avaliacao);

    }
}
