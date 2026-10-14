package exercicio5MediaNotasEx1;

import java.util.Scanner;

//Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5

public class Exercicio005_MediaNotas_Ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1;
		double nota2;
		System.out.println("Primeira nota:");
		nota1 = teclado.nextDouble();
		System.out.println("Segunda nota:");
		nota2 = teclado.nextDouble();
		double media;
		
		media = (nota1 + nota2)/2;
		System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
		
		teclado.close();

	}

}
