//12) Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.

import java.util.Scanner;

public class Exercicio012_DescontoProduto {
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            System.out.print("Preço do produto: ");
            double preco = teclado.nextDouble();
            double precoPromocional = preco * 0.95;
            System.out.printf("Preço promocional do produto: %.2f", precoPromocional);
        }
    }
}
