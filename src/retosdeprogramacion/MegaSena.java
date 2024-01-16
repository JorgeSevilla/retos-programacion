package retosdeprogramacion;

import java.util.Random;

public class MegaSena {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numeros = new int[6];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(60) + 1;
		}
		
		System.out.println("Números aleatórios");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println();
		

	}

}
