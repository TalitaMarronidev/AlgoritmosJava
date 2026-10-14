package exercicio2BoasVindasPersonalizadas;

import java.util.Scanner;

// Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
//Ex:
//Qual é o seu nome? João da Silva
//Olá João da Silva, é um prazer te conhecer!

public class Exercicio002_BoasVindasPersonalizadas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.println("Qual é o seu nome?");
		nome = teclado.nextLine();
		
		System.out.println("Olá " + nome + ", é um prazer te conhecer!");
		
		teclado.close();
	}

}
