package retosdeprogramacion.area.poligono;

public class Triangle implements Polygon {

	private double height;
	private double base;

	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public double area() {
		return (base * height) / 2;
	}

	@Override
	public void printArea() {
		System.out.printf("El área del triángulo es: %.2f%n", area());

	}

}
