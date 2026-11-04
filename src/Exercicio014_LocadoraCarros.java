//14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
//  Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

import java.util.Scanner;

public class Exercicio014_LocadoraCarros {
    public static void main(String[] args) {
        try(Scanner teclado = new Scanner(System.in)){

            System.out.print("Quantidade de km percorridos: ");
            double km = teclado.nextDouble();

            System.out.print("Quantidade de dias pelo qual o carro foi alugado: ");
            int dias = teclado.nextInt();

            double precokm = km * 0.20;
            double precodias = dias * 90;
            double precoTotal = precokm + precodias;

            System.out.printf("Preço por km rodados: R$ %.2f%n", precokm);
            System.out.printf("Preço por dias rodados: R$ %.2f%n", precodias);
            System.out.printf("Preço total: R$ %.2f", precoTotal);




        }
    }
}
