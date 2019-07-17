package merve.shapes;

public class Circle extends Object{
    protected int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
        System.out.println("Circle is being created");

    }
    public Circle() {
        this.radius =5;
        System.out.println("Circle is being created");
    }
    public double area() {
        return 3.14 * radius * radius;
    }

}