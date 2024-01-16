/*Adivina el número: Genera un número aleatorio entre 1 y 100. 
 * Pide al usuario que adivine el número en el menor número de intentos posible. 
 * Utiliza if else elseif para dar pistas como "mayor", "menor", "adivinaste".
 */

package retosdeprogramacion;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int randomNumber = random.nextInt(1, 101);
		int attemps = 0;
		
		while (attemps < 10) {
			System.out.println("Adivina un número entre 1 y 101");
			int numberEntered = scanner.nextInt();
			
			if (numberEntered > randomNumber) {
				System.out.println("Número es menor:");
			} else if (numberEntered < randomNumber) {
				System.out.println("Número es mayor");
			} else {
				System.out.println("!Acertaste! El número era: " + randomNumber);
				break;
			}
			attemps++;
		}
		
		if (attemps == 10) {
			System.out.println("Perdiste el número era: " + randomNumber);
		}
		
	}

}
