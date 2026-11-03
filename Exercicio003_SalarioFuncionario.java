//3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo
//Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.

import java.util.Scanner;

public class Exercicio003_SalarioFuncionario {
  public static void main(String[] args) {
    try(Scanner teclado = new Scanner(System.in)){
        System.out.println("Nome do funcionário: ");
        String funcionario = teclado.nextLine();
        System.out.println("Salário: ");
        double salario = teclado.nextDouble();
        System.out.printf("O funcionário %s tem um salário de R$%.2f em Junho.%n",funcionario, salario);
    }
  }
}
