//27) Crie um programa que leia duas notas de um aluno e calcule a sua média, mostrando uma mensagem no final, de acordo com a média atingida:
// - Média até 4.9: REPROVADO
// - Média entre 5.0 e 6.9: RECUPERAÇÃO
// - Média 7.0 ou superior: APROVADO

import java.util.Scanner;

public class Exercicio027_MediaEscolar_Ex2 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("1° Nota: ");
            double nota1 = teclado.nextDouble();

            System.out.print("2° Nota: ");
            double nota2 = teclado.nextDouble();

            double media = (nota1 + nota2)/2;
            System.out.printf("Média: %.2f%n", media);

            if (media <= 4.9){
                System.out.println("REPROVADO!!");
            } else if (media <= 6.9) {
                System.out.println("RECUPERAÇÃO!!");
            } else {
                System.out.println("APROVADO!!");
            }
        }
    }
}
