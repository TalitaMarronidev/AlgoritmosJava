package exercicio18VotoIdade;

import java.util.Scanner;

// Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.

public class Exercicio018_VotoIdade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anoNascimento;
		System.out.println("Informe seu ano de nascimento: ");
		anoNascimento = teclado.nextInt();
		int idade = 2026 - anoNascimento;
		
		if(idade >= 18) {
			System.out.print("Sua idade é: " + idade + ", você pode votar esse ano.");
		}
		
		else{
			System.out.print("Sua idade é: " + idade + ", você não pode votar esse ano.");
		}
		
		teclado.close();
	}
}
