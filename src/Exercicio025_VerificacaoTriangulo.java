//25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta. Analise seus comprimentos e diga se é possível formar um triângulo com essas
//retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.

import java.util.Scanner;

public class Exercicio025_VerificacaoTriangulo {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("1° segmento de reta: ");
            double seg1 = teclado.nextDouble();

            System.out.print("2° segmento de reta: ");
            double seg2 = teclado.nextDouble();

            System.out.print("3° segmento de reta: ");
            double seg3 = teclado.nextDouble();

            if ((seg1 < seg2 + seg3) && (seg2 < seg1 + seg3) && (seg3 < seg1 + seg2)){
                System.out.print("É possível formar um triângulo.");
            } else {
                System.out.print("Não é possível formar um triângulo.");
            }
        }
    }
}
