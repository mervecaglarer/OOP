package drawingV3;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
