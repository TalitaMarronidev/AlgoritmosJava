package exercicio20ParOuImpar;

import java.util.Scanner;

//Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.

public class Exercicio020_ParOuImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Informe um número: ");
		num = teclado.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
		
		teclado.close();
	}

}
