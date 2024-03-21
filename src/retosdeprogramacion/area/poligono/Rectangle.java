package retosdeprogramacion.area.poligono;

public class Rectangle implements Polygon {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public void printArea() {
		System.out.printf("El área del rectángulo es: %.2f%n", area());

	}

}
