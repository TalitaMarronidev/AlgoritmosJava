package exercicio9ConversaoDolar;

import java.util.Scanner;

// Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

public class Exercicio009_ConversaoDolar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double reais;
		System.out.println("Informe a quantidade de dinheiro que você tem na carteira em R$:");
		reais = teclado.nextDouble();
		double dolares;
		
		dolares = reais / 5.01;
		System.out.println("Dinheiro em R$: " + reais);
		System.out.println("Taxa de câmbio atualmente: 5,01 real brasileiro");
		System.out.printf("Com o dinheiro na sua carteira você pode comprar %.2f dólares ", dolares);
		
		
		teclado.close();
	}

}
