package exercicio10AreaETinta;

import java.util.Scanner;

// Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta 
//uma área de 2metros quadrados.

public class Exercicio010AreaETinta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double largura;
		double altura;
		System.out.println("Informe a largura da parede: ");
		largura = teclado.nextDouble();
		System.out.println("Informe a altura da parede: ");
		altura = teclado.nextDouble();
		double area = largura * altura;
		double tinta = area / 2;
		
		
		System.out.printf("A área a ser pintada é de %.2f metros%n", area); 
		System.out.printf("A quantidade necessária de tinta é  %.2f %n", tinta);
		
		teclado.close();

	}

}
