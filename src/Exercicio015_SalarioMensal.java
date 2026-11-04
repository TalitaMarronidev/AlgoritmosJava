//15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

import java.util.Scanner;

public class Exercicio015_SalarioMensal {
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            System.out.print("Dias trabalhados no mês: ");
            int dias = teclado.nextInt();

            double horasPorDia = 8;
            double valorHora = 25;
            double salario = dias * horasPorDia * valorHora;
            
            System.out.printf("Salário: %.2f", salario);

        }
    }
}
