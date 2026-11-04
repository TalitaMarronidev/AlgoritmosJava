//8) Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 185.72
//A distância de 85.7m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//1857.2dm
//18572.0cm
//185720.0mm

import java.util.Scanner;

public class Exercicio008_ConversaoMedidas {
  public static void main(String[] args){
    try(Scanner teclado = new Scanner(System.in)){
        System.out.print("Digite uma distância em metros: ");
        double num = teclado.nextDouble();
        double km = num/1000;
        double hm = num/100;
        double dam = num/10;
        double dm = num * 10;
        double cm = num * 100;
        double mm = num * 1000;
        System.out.printf("A distância de %.2fm corresponde a:%n", num);
        System.out.printf("%.5f Km%n", km);
        System.out.printf("%.5f Hm%n", hm);
        System.out.printf("%.5f Dam%n", dam);
        System.out.printf("%.5f dm%n", dm);
        System.out.printf("%.5f cm%n", cm);
        System.out.printf("%.5f mm%n", mm);
        
    }
  }  
}
