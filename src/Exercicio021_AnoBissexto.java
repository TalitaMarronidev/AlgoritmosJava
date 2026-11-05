//21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.

import java.util.Scanner;

public class Exercicio021_AnoBissexto {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ano: ");
            int ano = teclado.nextInt();

            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
                System.out.printf("O ano %d é bissexto.", ano);
            } else {
                System.out.printf("O ano %d não é bissexto!", ano);
            }
        }
    }
}
