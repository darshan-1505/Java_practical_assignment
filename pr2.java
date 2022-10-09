// In an n-sided regular polygon, all sides have the same length and all angles have the 
// same degree (i.e., the polygon is both equilateral and equiangular). Design a class 
// named RegularPolygon that contains: 
// A private int data field named n that defines the number of sides in the polygon with
// default value 3.
// A private double data field named side that stores the length of the side with 
// default value 1.
// A private double data field named x that defines the x-coordinate of the polygon’s 
// center with default value 0.
// A private double data field named y that defines the y-coordinate of the 
// polygon’s center with default value 0.
// A no-arg constructor that creates a regular polygon with default values. 
// A constructor that creates a regular polygon with the specified number of sides 
// and length of side, centered at (0, 0).
// A constructor that creates a regular polygon with the specified number of 
// sides, length of side, and x- and y-coordinates.
// The accessor and mutator methods for all data fields.
// The method getPerimeter() that returns the perimeter of the polygon. 
// The method getArea() that returns the area of the polygon. The formula for 
// computing the area of a regular polygon is:

import java.util.*;
import java.math.*;

class RegularPolygon {
    private int n = 3;
    private double s = 1;
    private double x = 0;
    private double y = 0;
    double area;
    double pi = 3.14;
    double pari;

    int getNoside() {
        System.out.println("The Number of side is : " + n);
        return n;
    }

    void setNoside(int n) {
        this.n = n;
    }

    double getlengthos() {
        System.out.println("The Length Of side is : " + s);
        return s;
    }

    void setlengthos(Double s) {
        this.s = s;
    }

    public double getx() {
        System.out.println("The value of x is : " + x);
        return x;
    }

    public void setx(Double x) {
        this.x = x;
    }

    public double gety() {
        System.out.println("The value of y is : " + y);
        return y;
    }

    public void sety(Double y) {
        this.y = y;
    }

    public double perimeter() {
        pari = n * s;
        return pari;
    }

    public double area_count() {
        area = (n * s * s) / (4 * (Math.tan(pi / n)));
        return area;
    }
}

public class pr2 {
    public static void main(String[] args) {
        RegularPolygon r = new RegularPolygon();
        r.setNoside(5);
        r.setlengthos(10.5);
        r.setx(7.5);
        r.sety(8.5);
        r.getNoside();
        r.getlengthos();
        r.getx();
        r.gety();

        System.out.println("Perimeter of polygone : " + r.perimeter());
        System.out.println("Area of polygone : " + r.area_count());
    }
}
