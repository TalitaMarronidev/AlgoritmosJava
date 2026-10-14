package exercicio7DobroETercaParte;

import java.util.Scanner;

// Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666

public class Exercicio007_DobroETercaParte {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double numero;
		System.out.println("--DOBRO E TERÇA PARTE--");
		System.out.println("Informe um número real:");
		numero = teclado.nextDouble();
		double dobro;
		double tercaParte;
		
		dobro = numero * 2;
		tercaParte = numero / 3;
		
		System.out.println("O dobro de " + numero + " é " + dobro);
		System.out.println("A terça parte de " + numero + " é " + tercaParte);
		
		
		teclado.close();

	}

}
