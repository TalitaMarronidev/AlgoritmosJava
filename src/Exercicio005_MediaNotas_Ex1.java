//5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5

import java.util.Scanner;

public class Exercicio005_MediaNotas_Ex1 {
  public static void main(String[] args){
    try(Scanner teclado = new Scanner(System.in)){
        System.out.print("Nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Nota 2:");
        double nota2 = teclado.nextDouble();
        double media = (nota1 + nota2)/2;
        System.out.printf("A média entre %.2f e %.2f é igual a %.2f", nota1, nota2, media);
    }
  }  
}
