//16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e exiba o total em dias.

import java.util.Scanner;

public class Exercicio016_FumanteDiasPerdidos {
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            System.out.print("Quantidade de cigarros fumados por dia: ");
            int cigarrosDia = teclado.nextInt();

            System.out.print("Quantos anos de fumante: ");
            int anosFumante = teclado.nextInt();

            int diasFumando = anosFumante * 365;
            int minutosPerdidos = cigarrosDia * diasFumando * 10;

            double diasPerdidos = minutosPerdidos / 1440.0;

            System.out.printf("Você perderá %.2f dias de vida", diasPerdidos);
        }
    }
}
