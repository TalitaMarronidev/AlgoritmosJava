//31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

import java.util.Scanner;
import java.util.Random;

public class Exercicio031_JogoJokenPo {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("--------------------  MENU  ---------------------------");
            System.out.println("[1] Pedra");
            System.out.println("[2] Papel");
            System.out.println("[3] Tesoura");
            System.out.print("Informe a opção escolhida: ");
            int op = teclado.nextInt();

            if (op < 1 || op > 3) {
            System.out.println("Opção inválida!");
            return;
}


            Random sorteio = new Random();
            int computador = sorteio.nextInt(1, 4);

            String jogador = "";
          

            switch (op) {
                case 1 -> jogador = "Pedra";
                case 2 -> jogador = "Papel";
                case 3 -> jogador = "Tesoura";
                default -> System.out.println("Opção Inválida!");
            }

            String  computadorTexto = "";

            switch (computador) {
                case 1 -> computadorTexto = "Pedra";
                case 2 -> computadorTexto = "Papel";
                case 3 -> computadorTexto = "Tesoura";
            }

            System.out.printf("Você escolheu: %s%n", jogador);
            System.out.printf("O computador escolheu: %s%n", computadorTexto);
            
            if ((op == 1) && (computador == 1)){
                System.out.print("Deu empate.");
            } else if ((op == 1) && (computador == 2)) {
                System.out.print("Computador ganhou.");
            } else if ((op == 1) && (computador == 3)){
                System.out.print("Você ganhou.");
            }

            if ((op == 2) && (computador == 1)){
                System.out.print("Você ganhou.");
            } else if ((op == 2) && (computador == 2)) {
                System.out.print("Deu empate.");
            } else if ((op == 2) && (computador == 3)){
                System.out.print("Computador ganhou.");
            }

            if ((op == 3) && (computador == 1)){
                System.out.print("Computador ganhou.");
            } else if ((op == 3) && (computador == 2)) {
                System.out.print("Você ganhou.");
            } else if ((op == 3) && (computador == 3)){
                System.out.print("Deu empate.");
            }

        }
    }
}
