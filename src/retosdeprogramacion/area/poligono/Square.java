package retosdeprogramacion.area.poligono;

public class Square implements Polygon {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public void printArea() {
		System.out.printf("El área del cuadrado es: %.2f%n", area());
	}

}
