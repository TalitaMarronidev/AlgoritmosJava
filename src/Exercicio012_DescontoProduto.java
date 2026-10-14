package exercicio12DescontoProduto;

import java.util.Scanner;

// Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.

public class Exercicio012_DescontoProduto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double produto;
		System.out.println("Informe o preço do produto: ");
		produto = teclado.nextDouble();
		double precoPromocional = produto - (produto * 0.05);
		
		System.out.printf("Preço do produto: R$%.2f%n", produto);
		System.out.printf("Desconto: R$%.2f%n", produto * 0.05);
		System.out.printf("Preço promocional: R$%.2f%n", precoPromocional);
		
		teclado.close();
	}

}
