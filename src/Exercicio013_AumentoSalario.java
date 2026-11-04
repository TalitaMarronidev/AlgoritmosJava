//13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.

import java.util.Scanner;

public class Exercicio013_AumentoSalario {
    public static void main(String[] args) {
        try(Scanner teclado = new Scanner(System.in)){
            System.out.print("Salário: ");
            double salario = teclado.nextDouble();
            double novoSalario = salario * 1.15;
            System.out.printf("Novo salário: %.2f", novoSalario);
        }   
    }
}
