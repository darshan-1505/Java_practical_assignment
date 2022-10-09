// Design an interface named Colorable with a void method named howToColor(). 
// Every class of a colorable object must implement the Colorable interface. Design a 
// class named Square that extends GeometricObject and implements Colorable. 
// Implement howToColor to display the message Color all four sides. The Square
// class contains a data field side with getter and setter methods, and a constructor for 
// constructing a Square with a specified side. The Square class has a private double 
// data field named side with its getter and setter methods. It has a no-arg constructor
// to create a Square with side 0, and another constructor that creates a Square with the 
// specified side


interface Colorable 
{
    static void howToColor() 
    {}
}
class GeometricObject implements Colorable 
{
    static void howToColor() 
    {
        System.out.println();
    }
}
class Square extends GeometricObject 
{
    private double side1 = 0;

    Square() 
    {
        System.out.println("Default constructor");
        System.out.println("The area of square is : " +side1 * side1);
    }

    public double getside1() 
    {
        return side1;
    }
    public void setside1(double side1) 
    {
        this.side1 = side1;
    }

    public void area() 
    {
        System.out.println("For given value of Square : ");
        System.out.println("The area of square is : " +this.side1 * this.side1);
    }
}
public class pr9
{
    public static void main(String[] args) 
    {
        Square s = new Square();
        pr9 p = new pr9();
        s.setside1(10);
        s.getside1();
        s.area();
    }
}
    