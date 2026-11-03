//6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10

import java.util.Scanner;

public class Exercicio006_AntecessorESucessor {
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            int antecessor = numero - 1;
            int sucessor = numero + 1;
            System.out.printf("O antecessor de %d é %d%n",numero, antecessor);
            System.out.printf("O sucessor de %d é %d%n", numero, sucessor);
        }
    }
}
