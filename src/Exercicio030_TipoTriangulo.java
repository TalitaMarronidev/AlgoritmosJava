//30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado:
// - EQUILÁTERO: todos os lados iguais
// - ISÓSCELES: dois lados iguais
// - ESCALENO: todos os lados diferentes

import java.util.Scanner;

public class Exercicio030_TipoTriangulo {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("1° segmento de reta: ");
            double seg1 = teclado.nextDouble();

            System.out.print("2° segmento de reta: ");
            double seg2 = teclado.nextDouble();

            System.out.print("3° segmento de reta: ");
            double seg3 = teclado.nextDouble();

            if ((seg1 < seg2 + seg3) && (seg2 < seg1 + seg3) && (seg3 < seg1 + seg2)){

                System.out.println("É possível formar um triângulo.");

                if ((seg1 == seg2) && (seg2 == seg3)){
                    System.out.print("É um triângulo equilátero.");

                } else if ((seg1 == seg2) || (seg1 == seg3) || (seg2 == seg3)) {
                    System.out.print("É um triângulo isósceles.");

                } else {
                    System.out.print("É um triângulo escaleno");
                }

            } else {
                System.out.print("Não é possível formar um triângulo.");
            }
        }
    }
}
