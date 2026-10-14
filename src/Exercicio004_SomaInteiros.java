package exercicio4SomaInteiros;

import java.util.Scanner;

// Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.

public class Exercicio004_SomaInteiros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1;
		int valor2;
		System.out.print("Informe o primeiro valor:");
		valor1 = teclado.nextInt();
		System.out.print("Informe o segundo valor:");
		valor2 = teclado.nextInt();
		int soma = valor1 + valor2;
	
	
		System.out.println("A soma entre " + valor1 + " e " + valor2 + " é igual a " + soma);
		
		teclado.close();
	
	}

}
