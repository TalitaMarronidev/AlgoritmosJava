//19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).

import java.util.Scanner;

public class Exercicio019_MediaEscolarComAvaliação {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Aluno(a): ");
            String aluno = teclado.nextLine();

            System.out.print("1° nota: ");
            double nota1 = teclado.nextDouble();

            System.out.print("2° nota: ");
            double nota2 = teclado.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.printf("Aluno(a): %s%n ", aluno);
            System.out.printf("Média: %.2f%n",media);
            
            if (media < 7) {
                System.out.print("O aluno não teve um bom aproveitamento.");
            } else if (media == 7) {
                System.out.print("O aluno ficou na média.");
            } else {
                System.out.print("O aluno teve um aproveitamento.");
            }


        }
    }
}
