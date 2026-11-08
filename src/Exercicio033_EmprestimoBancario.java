//33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa. O programa vai perguntar o valor da casa, o salário do comprador eem quantos anos ele vai pagar. 
// Calcule o valor da prestação mensal, sabendo que
//ela não pode exceder 30% do salário ou então o empréstimo será negado.

import java.util.Scanner;

public class Exercicio033_EmprestimoBancario {
  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
        System.out.println("Informe os dados: ");
        System.out.print("Valor da casa: ");
        double valorCasa = teclado.nextDouble();

        System.out.print("Informe o salário do comprador: ");
        double salario = teclado.nextDouble();

        System.out.print("Informe em quantos anos pretende pagar: ");
        int anos = teclado.nextInt();

        double parcela = (valorCasa / anos) / 12;

        double porcentagemSalario = salario * 0.30;

        System.out.printf("O valor aprovado para parcela é de: %.2f%n", porcentagemSalario);
        System.out.printf("Valor da parcela: %.2f%n", parcela);
        
        if (parcela <= porcentagemSalario){
            System.out.printf("Empréstimo Aprovado!");
        } else {
            System.out.print("Empréstimo negado!"); 
        }
  }  
}

}
