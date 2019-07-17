package merve.shapes3d;
import merve.shapes.Circle;

public class Cylinder extends Circle{
    protected int height;

    
    public Cylinder(){
        super(5);    //this(r,10);
        height=10;   //super and this must be always first line!
        System.out.println("Cylinder is being created");
    }
    
    public Cylinder(int r,int h){
        super(5);
        height=h;
        System.out.println("Cylinder is being created");

    }
    public double area(){
        return 2 * super.area() + 2 * Math.PI *radius * height;

    }
    public double volume(){
        return super.area() * height;
    }
    public String tosString(){
        return "radius= " + radius + ", height= " + height ;
    }

    
    
}