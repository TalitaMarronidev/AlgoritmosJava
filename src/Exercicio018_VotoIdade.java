//18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.

import java.util.Scanner;

public class Exercicio018_VotoIdade {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ano de nascimento: ");
            int anoNascimento = teclado.nextInt();

            int anoAtual = 2026;
            int idade = anoAtual - anoNascimento;


            if (idade < 16) {
                System.out.println("Você não pode votar, não tem idade suficiente.");
            } else if (idade >= 16 && idade < 18) {
                System.out.println("Voto facultativo.");
            } else if (idade >= 18 && idade < 70) {
                System.out.println("Voto obrigatório.");
            } else {
                System.out.println("Voto facultativo.");
            }
        }
    }
}
