//22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
//- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
// - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.

import java.util.Scanner;

public class Exercicio022_AlistamentoMilitar {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ano de Nascimento: ");
            int anoNascimento = teclado.nextInt();

            int anoAtual = 2026;
            int idade = anoAtual - anoNascimento;

            if (idade < 18){
                int anosFalta = 18 - idade;
                System.out.printf("Falta %d ano(s) para o alistamento.", anosFalta);
            } else if (idade > 18) {
                int anosPassados = idade - 18;
                System.out.printf("Já se passaram %d ano(s) desde o alistamento.", anosPassados);
            } else {
                System.out.print("Você está na idade de alistamento.");
            }
        }
    }
}
