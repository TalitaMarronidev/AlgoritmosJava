//4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.

import java.util.Scanner;

public class Exercicio004_SomaInteiros {
  public static void main(String[] args){
    try(Scanner teclado = new Scanner(System.in)){
        System.out.print("Digite um valor: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite outro valor: ");
        int num2 = teclado.nextInt();
        int soma = num1 + num2;
        System.out.printf("A soma entre %d e %d é igual a %d%n", num1, num2, soma);
    }
  }  
}
