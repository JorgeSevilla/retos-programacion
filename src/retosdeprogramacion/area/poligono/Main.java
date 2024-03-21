/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

package retosdeprogramacion.area.poligono;

public class Main {

	public static void main(String[] args) {
		area(new Triangle(10.5, 7.2));
		area(new Rectangle(15.5, 70.2));
		area(new Square(4.6));

	}

	private static double area(Polygon polygon) {
		polygon.printArea();
		return polygon.area();
	}

}
