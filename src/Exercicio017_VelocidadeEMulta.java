package exercicio17VelocidadeEMulta;

import java.util.Scanner;

//Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa, cobrando
//R$5 por cada Km acima da velocidade permitida.

public class Exercicio017_VelocidadeEMulta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int velocidade;
		System.out.println("Velocidade do carro:");
		velocidade = teclado.nextInt();
		double multa = (velocidade - 80) * 5;
		
		if(velocidade > 80) {
			System.out.println("Você foi multado!");
			System.out.printf("A multa é de R$: %.2f", multa);
		}
		
		else {
			System.out.println("Você está no limite permitido!");
		}

		
		teclado.close();
	}

}
