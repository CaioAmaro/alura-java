package desafio.main;

import desafio.modelo.Cartao;
import desafio.modelo.Produto;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cartao cartao = new Cartao();

        System.out.print("Digite o limite do cartão: ");
        cartao.setLimite(input.nextDouble());

        System.out.println("---------------");

        boolean loop = true;
        while(loop){
            Produto produto = new Produto();

            System.out.println("Limite Disponivel: " + cartao.getLimite());
            System.out.print("Descrição do Produto: ");
            produto.setDescricao(input.next());

            System.out.print("Valor: ");
            produto.setValor(input.nextDouble(), cartao);


            System.out.println("---------------");

            cartao.adicionarLista(produto);
            System.out.println("Compra realizada com sucesso!");

            if(cartao.getLimite() == 0){
                break;
            }

            System.out.println("Você deseja continuar comprando? ");
            System.out.println("O - Sair / 1 - Continuar");
            System.out.print("Opção: ");
            if(input.nextInt() == 0){
                break;
            }

            System.out.println();
            System.out.println("----");
        }

        if(cartao.getLimite() == 0) {
            System.out.println("Você utilizou seu limite de cartão.");
        }else{
            System.out.println("Você finalizou sua compra.");
        }

        System.out.println();

        System.out.println("Lista de Compras!");

        //cartao.getListaCompras().sort(Comparator.comparing(Produto::getValor)); //Usando Comparator.
        Collections.sort(cartao.getListaCompras()); //Usando interface Comparable (Ordem Natural)

        for(Produto produto: cartao.getListaCompras()){
            System.out.println(produto);
        }

    }
}

