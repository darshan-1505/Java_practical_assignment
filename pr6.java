
// Design a class named Triangle that extends GeometricObject. 
//  The class contains: Three double data fields named side1, side2, and side3 
// with default values 1.0 to denote three sides of a triangle. 
//  A no-arg constructor that creates a default triangle. 
//  A constructor that creates a triangle with the specified side1, side2, and side3.
//  The accessor methods for all three data fields.
//  A method named getArea() that returns the area of this triangle.
//  A method named getPerimeter() that returns the perimeter of this triangle.
//  A method named toString() that returns a string description for the triangle. 
// return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + 
// side3.
import java.util.*;
import java.math.*;

class GeometricObject {

}

class Triangle extends GeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    double peri;
    double area;

    public Triangle() {
        System.out.println("Side1 : " + side1);
        System.out.println("Side2 : " + side2);
        System.out.println("Side3 : " + side3);
    }

    public double getSide1() {
        System.out.println("Side1 : " + side1);
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        System.out.println("Side2 : " + side2);
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        System.out.println("Side3 : " + side3);
        return side3;
    }

    public void setSide3(Double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        peri = side1 + side2 + side3;
        return peri;
    }

    public double getarea() {
        double P = peri / 2.0;
        area = Math.sqrt(P * (P - side1) * (P - side2) * (P - side3));
        return area;
    }

    void tostring() {
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + side1);
        System.out.println("Side2 : " + side2);
        System.out.println("Side3 : " + side3);

        System.out.println("Area of Triange Is : " + getarea());
        System.out.println("Perimeter of Triange Is : " + getPerimeter());
    }

    public Triangle(double a, double b, double c) {
        side1 = a;
        side2 = b;
        side3 = c;

        double peri = a + b + c;
        double p = peri / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("For Triangle : ");
        System.out.println("The Triangle Having 3 Sides : ");
        System.out.println("Side1 : " + a);
        System.out.println("Side2 : " + b);
        System.out.println("Side3 : " + c);
        System.out.println("Area of Triange Is : " + area);
        System.out.println("Perimeter of Triange Is : " + peri);
    }
}

public class pr6 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(3, 4, 5);
    }

}
