package drawingV2;

import java.util.ArrayList;

public class Drawing {
	private ArrayList<Object> shapes = new ArrayList<Object>();
	

	public double calculateTotalArea() {
		double totalArea = 0;
		for (Object obj : shapes) {
			if(obj instanceof Circle){
				Circle c = (Circle) obj;
				totalArea += c.area(); 
			}
			else if(obj instanceof Rectangle){
				Rectangle r = (Rectangle) obj;
				totalArea += r.area(); 
			}
			else if(obj instanceof Square){
				Square s = (Square) obj;
				totalArea += s.area(); 
			}
			
		}
		return totalArea;
	}
	
	public void addShape(Object obj) {
		shapes.add(obj);
	}
	
	
}
