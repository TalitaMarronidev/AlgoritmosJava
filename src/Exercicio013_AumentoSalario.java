package exercicio13AumentoSalario;

import java.util.Scanner;

//Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.

public class Exercicio013_AumentoSalario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario;
		System.out.println("Informe o seu salário atual: ");
		salario = teclado.nextDouble();
		double novoSalario = salario * 1.15;
		
		System.out.printf("Seu novo salário é: %.2f", novoSalario);
		
		teclado.close();

	}

}
