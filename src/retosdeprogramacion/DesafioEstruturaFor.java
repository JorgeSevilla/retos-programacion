/*1) Desafio da estrutura for
Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma dos números digitados.
Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado, ignore e solicite um novo número ao usuário.*/
package retosdeprogramacion;

import java.util.Scanner;

public class DesafioEstruturaFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int somarNumeros = 0; 
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Digite 10 números pares");
			int numero = entrada.nextInt();
			if (numero % 2 == 0) {
				somarNumeros += numero;
			} else {
				System.out.println("Inserir somente números pares: ");
				i--;
			}
		}
		
		System.out.printf("O resultado da suma é: %d%n", somarNumeros);

	}

}
