//24) Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até 200Km e R$0.45 para viagens mais longas.

import java.util.Scanner;

public class Exercicio024_PrecoPassagem {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Distância que deseja percorrer (km): ");
            double distancia = teclado.nextDouble();

            double passagem;

            if (distancia <= 200) {
                passagem = distancia * 0.50;

            } else {
                passagem = distancia * 0.45;
            }

            System.out.printf("O preço da passagem é de: %.2f", passagem);
        }
    }
}
