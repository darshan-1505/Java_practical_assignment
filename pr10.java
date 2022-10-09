// Define a class named ComparableSquare that extends Square and implements 
// Comparable. Implement the compareTo method to compare the Squares on the basis 
// of area. Write a test class to find the larger of two instances of 
// ComparableSquareobjects.

class squre 
{
    double side1;
    double area;
    public double getside1() 
    {
        return side1;
    }
    public void setside1(double side1) 
    {
        this.side1 = side1;
    }

    public void area1() 
    {
        area = this.side1 * this.side1;
        System.out.println("The area of square is : " + area);
    }
}

class ComparableSquare extends squre 
{
    double side2;

    public double getside2() 
    {
        return side2;
    }
    public void setside2(double side2) 
    {
        this.side2 = side2;
    }

    public void area2() 
    {
        area = this.side2 * this.side2;
        System.out.println("The area of square is : " +area);
    }
}
class test extends ComparableSquare
{
    public void comp() 
    {
        if (side1 == side2) 
        {
            System.out.println("The Square and ColorableSquare is Same");
        } 
        else 
        {
            System.out.println("The Square and ColorableSquare is not Same");
        }
    }
}
public class pr10 
{
    public static void main(String[] args) 
    {
        test t=new test();
        t.setside1(12);
        t.getside1();
        t.area1();
        t.setside2(12);
        t.getside2();
        t.area2();
        t.comp();
    }
}