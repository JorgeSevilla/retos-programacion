/*Clasifica triángulos: Pide al usuario que ingrese la longitud de los tres lados de un triángulo. 
 * Usa if else elseif para determinar si es equilátero, isósceles, escaleno o no es un triángulo.*/

package retosdeprogramacion;

import java.util.Scanner;

final class ClassifyTriangles {

	public static void main(String[] args) {
		//Pide al usuario que ingrese la longitud de los tres lados de un triangulo
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la longitud de un lado 1");
		int lenghtSide1 = scanner.nextInt();
		
		System.out.println("Ingrese la longitud del lado 2");
		int lenghtSide2 = scanner.nextInt();
		
		System.out.println("Ingrese la longitud del lado 3");
		int lenghtSide3 = scanner.nextInt();
		
		//Valida si es triángulo
		
		if (lenghtSide1 + lenghtSide2 > lenghtSide3 && lenghtSide1 + lenghtSide3 > lenghtSide2 &&
				lenghtSide2 + lenghtSide3 > lenghtSide1) {
			//Equilátero -> 3 lados iguales
			if (lenghtSide1 == lenghtSide2 && lenghtSide1 == lenghtSide3) {
				System.out.println("Triángulo equilátero");
				
				//Triángulo isósceles -> 2 lados iguales.
			} else if (lenghtSide1 == lenghtSide2 || lenghtSide1 == lenghtSide3 || lenghtSide2 == lenghtSide3) {
				System.out.println("Triángulo isósceles");
				
				//Triángulo escaleno
			} else if (!(lenghtSide1 == lenghtSide2 && lenghtSide1 == lenghtSide3 && lenghtSide2 == lenghtSide3)) {
				System.out.println("Triángulo escaleno");
			}
		} else {
			System.out.println("No es un trángulo");
		}

	}

}
