/*Escreva um programa que solicita um número inteiro para o usuário e imprime na saída o número com os dígitos invertidos.
Por exemplo, se o número digitador for 98765, a saída deve ser 56789.
Este é um exercício intermediário, especialmente porque precisará usar suas habilidades em lógica. 
É possível fazer isso apenas com um loop e cálculos matemáticos.*/

package retosdeprogramacion;

import java.util.Scanner;

public class DesafioestruturaWhileIntermediario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número inteiro");
		int numero = entrada.nextInt();

		System.out.println("O número ingresado é: " + numero);
		
		int numeroInvertido = 0;

		while (numero > 0) {
			int resto = numero % 10;
			numeroInvertido = numeroInvertido * 10 + resto;
			numero /= 10;
		}
		System.out.println("O número inverso é: " + numeroInvertido);
	}

}
