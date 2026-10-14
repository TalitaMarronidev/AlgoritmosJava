package exercicio16FumanteDiasPerdidos;

import java.util.Scanner;

//[DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou. Considere que um fumante
//perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e exiba o total em dias.

public class Exercicio016_FumanteDiasPerdidos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa para calcular a redução de tempo de vida de um fumante");
		int cigarrosDia;
		int anosFumando;
		System.out.println("Informe a quantidade de cigarros por dia: ");
		cigarrosDia = teclado.nextInt();
		System.out.println("Informe a quantidade de anos: ");
		anosFumando = teclado.nextInt();
		double diasFumando = anosFumando * 365;
		double totalCigarros = cigarrosDia * diasFumando;
		double minutosPerdido  = totalCigarros * 10;
		double diasPerdido = minutosPerdido / 1440;
		
		System.out.printf("Você perdeu %.2f", diasPerdido);
		teclado.close();
		

	}

}
