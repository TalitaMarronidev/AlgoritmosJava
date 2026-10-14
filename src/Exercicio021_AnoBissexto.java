package exercicio21AnoBissexto;

import java.util.Scanner;

// Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.

public class Exercicio21_AnoBissexto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ano:");
		int ano;
		ano = teclado.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
		    System.out.println("Esse ano é bissexto!");
		}
		else {
		    System.out.println("Esse ano não é bissexto!");
	
		}
		
		teclado.close();
	}

}
