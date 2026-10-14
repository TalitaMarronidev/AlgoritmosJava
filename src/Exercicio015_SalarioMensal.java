package exercicio15SalarioMensal;

import java.util.Scanner;

//Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

public class Exercicio015_SalarioMensal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int diasTrabalhados;
		System.out.println("Informe o número de dias trabalhados no mês: ");
		diasTrabalhados = teclado.nextInt();
		double salarioFuncionario = diasTrabalhados * 8 * 25;
		
		System.out.printf("O salário desse mês é: %.2f", salarioFuncionario);
		
		teclado.close();
	}

}
