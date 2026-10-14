package exercicio6AntecessorESucessor;

import java.util.Scanner;

//Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10

public class Exercicio006_AntecessorESucessor {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	int numero;
	System.out.println(" ---- ANTECESSOR E SUCESSOR ----");
	System.out.println("Digite um número inteiro:");
	numero = teclado.nextInt();
	int antecessor;
	int sucessor;
	
	antecessor = numero - 1;
	sucessor = numero + 1;
	
	System.out.println("Número digitado: " + numero);
	System.out.println("Antecessor: " + antecessor);
	System.out.println("Sucessor: " + sucessor);
	
	
	teclado.close();
	}

}
