/*Desafio da estrutura for (intermediário)
Escreva um programa que solicita um número inteiro positivo para o usuário e imprime na saída uma mensagem dizendo 
se o número digitado é um número primo ou não.
Números primos são números naturais que possuem dois divisores: 1 e ele mesmo.
Por exemplo, o número 1 não é um número primo, porque ele tem apenas o número 1 (ele mesmo) como divisor. O número 2 é primo, 
porque ele é divisível por 1 e ele mesmo. O número 4 não é primo, porque ele é divisível por 1, 2 e 4.
Para saber se um número é divisível por outro, basta usar o operador de módulo (resto) e avaliar se é igual a 0.*/

package retosdeprogramacion;

import java.util.Scanner;

public class DesafioEstruturaFortIntermediario {

	/*public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite un número inteiro");
		int numero = entrada.nextInt();
		
		boolean numeroPrimo = true;
		
		for (int i = 2; i < numero; i++) {
			if (i % 1 == 0) {
				numeroPrimo = false;
				break;
			}
		}
		
		if (numeroPrimo && numero > 1) {
			System.out.printf("%d Número primo: ", numero);
		} else {
			System.out.printf("%d Não é primo: ", numero);
		}

	}*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite un número inteiro positivo: ");
		int numero = entrada.nextInt();
		
		if (numero <= 1) {
			System.out.println("O número não é primo");
		} else {
			boolean primo = true;
			for (int i = 2; i < numero; i++ ) {
				if (numero % i == 0) {
					primo = false;
					break;
				}
			}
			if (primo) {
				System.out.println("O número é primo");
			} else {
				System.out.println("O número não é primo");
			}
		}
	}

}
