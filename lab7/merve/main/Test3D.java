package merve.main;

import merve.shapes3d.Cylinder;

public class Test3D {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(6, 10);

        System.out.println(cylinder.toString());
    }

}