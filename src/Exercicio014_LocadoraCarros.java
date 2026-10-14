package exercicio14LocadoraCarros;

import java.util.Scanner;

// A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais 
//ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

public class Exercicio014_LocadoraCarros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qtdKm;
		int qtdDias;
		System.out.println("Informe a quantidade de Km percorridos: ");
		qtdKm = teclado.nextInt();
		System.out.println("Informe a quantidade de dias que o carro foi alugado: ");
		qtdDias = teclado.nextInt();
		double custoDia = qtdDias * 90;
		double custoKm = qtdKm * 0.20;
		double valorTotal = custoDia + custoKm;
		
		System.out.printf("O valor a ser cobrado por dia é %.2f%n", custoDia);
		System.out.printf("O valor a ser cobrado por Km é %.2f%n", custoKm);
		System.out.printf("O valor total a ser cobrado é %.2f%n", valorTotal);
		
		
		
		teclado.close();
	}

}
