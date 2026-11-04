//7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666

import java.util.Scanner;

public class Exercicio007_DobroeTercaParte {
    public static void main(String[] args){
        try(Scanner teclado = new Scanner(System.in)){
            System.out.print("Digite um número: ");
            double num = teclado.nextDouble();
            double dobro = num * 2;
            double tercaParte = num / 3;
            System.out.printf("O dobro de %.1f é %.5f%n", num, dobro);
            System.out.printf("A terça parte de %.1f é %.5f%n", num, tercaParte);
        }
    }
}
