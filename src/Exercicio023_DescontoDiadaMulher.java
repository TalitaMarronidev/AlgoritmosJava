//23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que:
// - Homens ganham 5% de desconto
// - Mulheres ganham 13% de desconto

import java.util.Scanner;

public class Exercicio023_DescontoDiadaMulher {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("Sexo: (f/m)");
            String sexo = teclado.nextLine();
            char letra = sexo.toLowerCase().charAt(0);

            System.out.print("Valor das compras: ");
            double valorCompras = teclado.nextDouble();

            if (letra == 'f') {
                double valorPromocional = valorCompras * 0.87;
                System.out.printf("%s, o preço da compra com desconto é de: %.2f", nome,  valorPromocional);
            } else if (letra == 'm') {
                double valorPromocional = valorCompras * 0.95;
                System.out.printf("%s, o preço da compra com desconto é de: %.2f", nome, valorPromocional);
            } else {
                System.out.print("Sexo inválido. Digite f ou m.");
            }
            
           
            

        }
    }
}
