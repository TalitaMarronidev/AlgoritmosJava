package exercicio8ConversaoMedidas;

import java.util.Scanner;

// Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 185.72
//A distância de 85.7m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//1857.2dm
//18572.0cm
//185720.0mm

public class Exercicio008_ConversaoMedidas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a distância em metros: ");
		double distancia;
		distancia = teclado.nextDouble();
		double km = distancia / 1000;
		double hm = distancia / 100;
		double dam = distancia / 10;
		double dm = distancia * 10;
		double cm = distancia * 100;
		double mm = distancia * 1000;
		
		System.out.println("A distância de " + distancia + " corresponde a: ");
		System.out.printf("%.2f Km%n", km);
		System.out.printf("%.2f hm%n", hm);
		System.out.printf("%.2f dam%n", dam);
		System.out.printf("%.2f dm%n", dm);
		System.out.printf("%.2f cm%n", cm);
		System.out.printf("%.2f mm%n", mm);
		
	
		
		
		
		teclado.close();

	}

}
