
public class Main {

	public static void main(String[] args) {
		 Rectangle rectA = new Rectangle();
	       Circle  circleA = new Circle(10);
	       rectA.SideA = 5;
	       rectA.SideB = 6;
	       int Area = rectA.area(); // we can directly call the method
		   int Perimeter = rectA.perimeter();
		  System.out.println("The area of the rectangle : " +  Area);
		  System.out.println("The perimeter of the rectangle " +  Perimeter);
	      System.out.println("The area of the circle :" + circleA.area());
	      System.out.println("The perimeter of the circle :" + circleA.perimeter());

	}

}
