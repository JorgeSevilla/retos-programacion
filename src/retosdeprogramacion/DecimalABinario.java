/*
 *  Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar 
 *  funciones propias del lenguaje que lo hagan directamente.
 */
package retosdeprogramacion;

public class DecimalABinario {

	public static void main(String[] args) {
		System.out.println(decimalTobinary(50));
	}
	
	public static String decimalTobinary(int decimal) {
		
		String binary = "";
		
		while(decimal != 0) {
			int remainder = decimal % 2;
			decimal /= 2;
			binary = remainder + binary;
		}
		
		if (binary.equals("")) {
			return "0";
		} else {
			return binary;
		}
		
	}
}
