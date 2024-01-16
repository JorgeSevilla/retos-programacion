/*Calculadora de descuentos: Crea una calculadora de descuentos basada en el total de la compra y el código de descuento ingresado. 
 *Aplica diferentes descuentos (if), descuentos especiales para clientes VIP (elseif), o precio sin descuento (else).*/

package retosdeprogramacion;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el valor de la compra");
		double purcharseValue = scanner.nextDouble();
		
		System.out.println("Ingrese el código de desconto");
		String discountCode = scanner.next();
		
		double discount = 0;
		
		if (discountCode.equals("10")) {
			discount = purcharseValue * 0.10;
		} else if (discountCode.equals("20")) {
			discount = purcharseValue * 0.20;
		} else if (discountCode.equals("30")) {
			discount = purcharseValue* 0.30;
		} else if (discountCode.equals("VIP")) {
			discount = purcharseValue * 0.50;
		} else {
			discount = 0;
		}
		
		double price = purcharseValue - discount;
		
		System.out.println("El precio final de la compra es: " + price);
	}

}
