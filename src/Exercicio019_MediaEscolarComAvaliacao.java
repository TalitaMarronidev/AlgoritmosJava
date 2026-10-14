package exercicio19MediaEscolarComAvaliacao;

import java.util.Scanner;

// Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento
//(se ficou acima da média 7.0).

public class Exercicio019_MediaEscolarComAvaliacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1;
		System.out.print("Informe a primeira nota: ");
		nota1 = teclado.nextDouble();
		double nota2;
		System.out.print("Informe a segunda nota: ");
		nota2 = teclado.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		System.out.printf("Sua média é de: %.2f%n", media);
		
		
		if (media >= 7) {
			System.out.print("Você teve um bom aproveitamento!!");
		}
		else {
			System.out.print("Você não teve um bom aproveitamento!!");
		}
		
		teclado.close();

	}

}
