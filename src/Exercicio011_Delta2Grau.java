//11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.

import java.util.Scanner;

public class Exercicio011_Delta2Grau {
    public static void main(String[] args) {
        try(Scanner teclado = new Scanner(System.in)){

            System.out.print("Valor a: ");
            double a = teclado.nextDouble();

            System.out.print("Valor b: ");
            double b = teclado.nextDouble();

            System.out.print("Valor c: ");
            double c = teclado.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;

            System.out.printf("Delta: %.2f%n", delta);


        }
    }
}
