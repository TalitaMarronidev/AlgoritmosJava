//29) Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
// - Até 3 anos de empresa: aumento de 3%
// - entre 3 e 10 anos: aumento de 12.5%
// - 10 anos ou mais: aumento de 20%

import java.util.Scanner;

public class Exercicio029_ReajusteSalario {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Funcionário(a): ");
            String funcionario = teclado.nextLine();

            System.out.print("Salário : ");
            double salario = teclado.nextDouble();

            System.out.print("Anos trabalhados na empresa: ");
            int anos = teclado.nextInt();

            double novoSalario;

            if ( anos <= 3){
                novoSalario = salario *  1.03;
            } else if (anos < 10) {
                novoSalario = salario * 1.125;
            } else {
                novoSalario = salario * 1.20;
            }

            System.out.printf("Funcionário(a): %s%n", funcionario);
            System.out.printf("Salário atual: R$ %.2f%n", salario);
            System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
        

        }
    }
}
