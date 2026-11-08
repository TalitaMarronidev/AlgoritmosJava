//26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
// - O primeiro valor é o maior
// - O segundo valor é o maior
// - Não existe valor maior, os dois são iguais

import java.util.Scanner;

public class Exercicio026_CompararNumeros {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("1° Valor: ");
            int num1 = teclado.nextInt();

            System.out.print("2° Valor: ");
            int num2 = teclado.nextInt();

            if (num1 > num2) {
                System.out.printf("O número %d é maior que o número %d.", num1, num2);
            } else if (num2 > num1) {
                System.out.printf("O número %d é maior que o número %d.", num2, num1);
            } else {
                System.out.println("Os dois números são iguais.");
            }
        }
    }
}
