/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
package retosdeprogramacion;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (i % 15 == 0) {
				System.out.println("fizzbuzz:" + i);
			}
			else if (i % 3 == 0) {
				System.out.println("fizz: " + i);
			} else if (i % 5 == 0) {
				System.out.println("buzz: " + i);
			} else {
				System.out.println("Números: " + i);
			}
			
		}
	}
}
