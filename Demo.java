import java.util.Scanner;
abstract class Shapes
{
    int a,b,c;
    abstract void area();
    abstract void perimeter();
}
class Circle extends Shapes
{
    double c_area,c_perimeter;
    Circle()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    a=sc.nextInt();
    }
    void area()
    {
        c_area=3.14*a*a;
        System.out.println("Area of circle is:"+c_area);
    }
    void perimeter()
    {
        c_perimeter=2*3.14*a;
        System.out.println("Perimeter of circle is:"+c_perimeter);
    } 
    
}
class Rectangle extends Shapes
{
    int r_area,r_perimeter;
    Scanner sc=new Scanner(System.in);
    Rectangle()
    {
        System.out.println("Enter the length of the rectangle");
         a=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
         b=sc.nextInt();
    }
    void area()
    {
        r_area=a*b;
        System.out.println("Area of rectangle is:"+r_area);
    }
    void perimeter()
    {
        r_perimeter=2*(a+b);
        System.out.println("Perimeter of rectangle is:"+r_perimeter);
    }
}

class Triangle extends Shapes
{
    double t_area;
    int t_perimeter;
    Triangle()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first side of the triangle");
    a=sc.nextInt();
    System.out.println("Enter the second side of the triangle");
    b=sc.nextInt();
    System.out.println("Enter the third side of the triangle");
    c=sc.nextInt();
    }
    void area()
    {
        t_area=0.5*a*b;
        System.out.println("Area of triangle is:"+t_area);
    }
    void perimeter()
    {
        t_perimeter=a+b+c;
        System.out.println("Perimeter of triangle is:"+t_perimeter);
    }
     
}


public class Demo
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.area();
        c.perimeter();
        System.out.println();
        Rectangle r=new Rectangle();
        r.area();
        r.perimeter();
        System.out.println();
        Triangle t=new Triangle();
        t.area();
        t.perimeter();
    }
}
