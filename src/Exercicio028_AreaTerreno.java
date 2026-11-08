//28) Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m². O programa também devemostrar a classificação desse terreno, 
// de acordo com a lista abaixo:
// - Abaixo de 100m² = TERRENO POPULAR
// - Entre 100m² e 500m² = TERRENO MASTER
// - Acima de 500m² = TERRENO VIP

import java.util.Scanner;

public class Exercicio028_AreaTerreno {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Largura: ");
            double largura = teclado.nextDouble();

            System.out.print("Comprimento: ");
            double comprimento = teclado.nextDouble();

            double area = largura * comprimento;
            System.out.printf("Área em m²: %.2f%n", area);

            if (area < 100) {
                System.out.println("TERRENO POPULAR.");
            } else if (area <= 500) {
                System.out.println("TERRENO MASTER.");
            } else {
                System.out.println("TERRENO VIP.");
            }
        }
    }
}
