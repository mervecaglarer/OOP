package drawingV3;

import java.util.ArrayList;

public class Drawing {
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	

	public double calculateTotalArea() {
		double totalArea = 0;
		
		for (Shape shape : shapes) {

				totalArea += shape.area(); 
		
		}
		
		return totalArea;
	}
	
	public void addShape(Shape obj) {
		shapes.add(obj);
	}
	
	
}
