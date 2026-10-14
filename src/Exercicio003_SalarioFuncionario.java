package exercicio3SalarioFuncionario;

import java.util.Scanner;

// Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo
//Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho

public class Exercicio003_SalarioFuncionario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String funcionario;
		double salario;
		System.out.println("Informe o nome do funcionário: ");
		funcionario = teclado.nextLine();
		System.out.println("Informe o salário do funcionário: ");
		salario = teclado.nextDouble();		

		
		System.out.println("Nome do funcionário: " + funcionario);
		System.out.println("Salário: " + salario);
		System.out.println("O(A) funcionário(a) " + funcionario + " tem um salário de R$" + salario + " no mês de Junho.");
		
		teclado.close();
	}

}
