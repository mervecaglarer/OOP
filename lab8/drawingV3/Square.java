package drawingV3;

public class Square extends Shape{

    double side;
    public Square (double side){
        this.side=side;
    }
    public double area(){
        return side * side;
    }
    
}