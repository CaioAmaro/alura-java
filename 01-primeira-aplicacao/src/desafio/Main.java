package desafio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void clienteShow(String nome, String tipoConta, double saldoAtual){

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println();
        System.out.println("***********************");
        System.out.println("Informações do cliente:");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo: R$" + df.format(saldoAtual));
        System.out.println("***********************");
        System.out.println();
    }

    public static void menu(){

        System.out.println();
        System.out.println("Operações");
        System.out.println();
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
        System.out.println();
        System.out.println("Digite a opção desejada ");
        System.out.print("R: ");

    }

    public static double receberValor(double saldo){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite o valor a receber: ");
        double valorRecebido = input.nextDouble();

        boolean valorValidator = (valorRecebido > 0 );
        while(!valorValidator){
            System.out.println();
            System.out.println("Você digitou um valor errado.");
            System.out.print("Digite o valor a receber: ");
            valorRecebido = input.nextDouble();
            valorValidator = (valorRecebido > 0 );
        }

        System.out.println();
        System.out.println("Operação realizada com sucesso!");

        return saldo + valorRecebido;
    }

    public static double transferirValor(double saldo){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Digite o valor a transferir: ");
        double valorTransferido = input.nextDouble();

        boolean valorValidator = (valorTransferido > 0  && valorTransferido <= saldo);
        while(!valorValidator){

            System.out.println();
            if(valorTransferido == 0) System.out.println("Você não pode transerir um saldo nulo!");
            else System.out.println("Saldo insuficiente! Disponivel: " + saldo);

            System.out.print("Digite o valor a Transferir: ");
            valorTransferido = input.nextDouble();
            valorValidator = (valorTransferido > 0  && valorTransferido <= saldo);
        }

        System.out.println();
        System.out.println("Operação realizada com sucesso!");

        return saldo - valorTransferido;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;


        System.out.print("Digite o nome do cliente: ");
        String nome = input.nextLine();
        System.out.print("Digite o qual tipo da Conta: ");
        String tipoConta = input.nextLine();
        System.out.print("Digite o qual Saldo Atual: ");
        double saldo = input.nextDouble();

        while(true){
            menu();
            opcao = input.nextInt();
            boolean opcaoValida = opcao >= 1 && opcao <= 4;

            while(!opcaoValida){
                System.out.println();
                System.out.println("Opção invalida");
                System.out.print("R: ");
                opcao = input.nextInt();
                opcaoValida = opcao >= 1 && opcao <= 4;
            }

            if(opcao == 1) clienteShow(nome, tipoConta, saldo);

            if(opcao == 2) saldo = receberValor(saldo);

            if(opcao == 3) saldo = transferirValor(saldo);

            if(opcao == 4){ // Opção saida.
                System.out.println();
                System.out.println("Saindo...");
                return;
            } //Saida

        }





    }
}