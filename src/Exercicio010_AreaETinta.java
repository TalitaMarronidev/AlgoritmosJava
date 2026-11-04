//10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma
//  área de 2metros quadrados.

import java.util.Scanner;

public class Exercicio010_AreaETinta {
    public static void main(String[] args) {
        try(Scanner teclado = new Scanner(System.in)){
            System.out.print("Largura: ");
            double largura = teclado.nextDouble();
            System.out.print("Altura: ");
            double altura = teclado.nextDouble();
            double area = largura * altura;
            double litro = area / 2;
            System.out.printf("A área da parede é %.2f m²%n", area);
            System.out.printf("Quantidade de tinta necessária: %.2f litros%n", litro);
        }   
    }
}
