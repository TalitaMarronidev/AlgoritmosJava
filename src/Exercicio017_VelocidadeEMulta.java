//17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, 
// cobrando R$5 por cada Km acima da velocidade permitida.

import java.util.Scanner;

public class Exercicio017_VelocidadeEMulta {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.print("Velocidade: ");
            int velocidade = teclado.nextInt();

            if (velocidade > 80) {
                System.out.println("Você foi multado!!");
                int valorMulta = (velocidade - 80) * 5;
                System.out.printf("Valor da multa: R$ %d%n", valorMulta);
            } else {
                System.out.println("Velocidade dentro do limite permitido.");
            }

        }
    }
}
