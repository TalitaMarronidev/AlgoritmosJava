//32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o jogador vai tentar descobrir qual foi o valor sorteado.

import java.util.Random;
import java.util.Scanner;

public class Exercicio032_JogoSorteioNumero {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            Random sorteio = new Random();
            int computador = sorteio.nextInt(1, 6);

            System.out.println("-----ADIVINHE O VALOR SORTEADO PELO COMPUTADOR-----");
            System.out.print("Número: ");
            int numeroSorteado = teclado.nextInt();

            if (numeroSorteado < 1 || numeroSorteado > 5) {
                System.out.print("Número Inválido. Digite um valor de 1 a 5.");
            } else if (numeroSorteado == computador) {
                System.out.print("Você adivinhou!!");
            } else {
                System.out.println("Não foi dessa vez.");
                System.out.printf("Você escolheu o número: %d%n", numeroSorteado);
                System.out.printf("O computador sorteou: %d", computador);
            }

        }
    }
}
