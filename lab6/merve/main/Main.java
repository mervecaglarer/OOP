package merve.main;

import java.util.ArrayList;

import merve.shapes.*;    /*import merve.shapes.Circle;
                            import merve.shapes.Square;*/

public class Main {
    public static void  main(String[] args) {

        ArrayList<Circle> circles = new ArrayList<Circle>();

        Circle circle = new Circle(5);

        circles.add(circle);
        circles.add(new Circle(4));
        circles.add(new Circle(6));

        for(int i=0;i<circles.size();i++){
            System.out.println(circles.get(i).area());
        }
        


        Square square=new Square(4);

        
    }
}