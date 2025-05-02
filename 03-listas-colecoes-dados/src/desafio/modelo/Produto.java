package desafio.modelo;

import java.util.Scanner;

public class Produto implements Comparable<Produto>{
    private String descricao;
    private double valor;

    Scanner input = new Scanner(System.in);

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor, Cartao cartao) {
        while(valor <=0 || valor > cartao.getLimite()){
            if(valor <= 0){
                System.out.println("Digite um valor maior que 0! ");
            }

            if(valor > cartao.getLimite()){
                System.out.println("Você não tem limite suficiente: ");
                System.out.println("Limite Disponivel: " + cartao.getLimite());
            }

            System.out.print("Valor: ");
            valor = input.nextDouble();
        }


        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.descricao + " - R$" + this.valor;
    }

    @Override
    public int compareTo(Produto o) {
        return Double.compare(this.valor, o.valor);
    }
}
