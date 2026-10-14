package exercicio22AlistamentoMilitar;

import java.util.Scanner;

//Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
//- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
//- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.

public class Exercicio022_AlistamentoMilitar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anoNascimento;
		System.out.println("Informe seu ano de nascimento:");
		anoNascimento = teclado.nextInt();
		int idade = 2026 - anoNascimento;
		int anosFalta = 18 - idade;
		int anosDepois = idade - 18;
		
		
		if ( idade < 18) {
			System.out.println("Você só poderá se alistar daqui " + anosFalta + " ano(s).");
		}
		else if (idade > 18){
			System.out.println("Se passaram " + anosDepois + " ano(s) do alistamento.");
		}

		else {
			System.out.println("Você está na idade exata para o alistamento.");
		}
		
		teclado.close();
	}

}
