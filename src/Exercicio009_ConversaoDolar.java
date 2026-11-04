//9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$5,47.

import java.util.Scanner;

public class Exercicio009_ConversaoDolar {
    public static void main(String[]args){
        try(Scanner teclado = new Scanner(System.in)){
            System.out.print("Dinheiro em carteira R$:");
            double dinheiro = teclado.nextDouble();
            double dolares = dinheiro / 5.47;
            System.out.printf("Você pode comprar %.2f dólares.%n", dolares);


        }
    }
}
