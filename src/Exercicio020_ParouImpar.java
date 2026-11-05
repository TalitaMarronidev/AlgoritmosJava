//20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.

import java.util.Scanner;

public class Exercicio020_ParouImpar {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Número: ");
            int numero = teclado.nextInt();

            if (numero % 2 == 0) {
                System.out.print("Esse número é par.");
            } else {
                System.out.print("Esse número é ímpar.");
            }
        }
    }
}
