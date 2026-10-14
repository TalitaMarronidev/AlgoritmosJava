package exercicio11Delta2Grau;

import java.util.Scanner;

// Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.

public class Exercicio011_Delta2Grau {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valorA;
		double valorB;
		double valorC;
		System.out.println("Informe o valor A:");
		valorA = teclado.nextDouble();
		System.out.println("Informe o valor B:");
		valorB = teclado.nextDouble();
		System.out.println("Informe o valor C:");
		valorC = teclado.nextDouble();
		double delta = (valorB * valorB) - (4 * valorA * valorC);
		
		System.out.printf("O valor do delta é de: %.2f%n", delta);
		
		teclado.close();
	}

}
