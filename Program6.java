//import stuff here!

//Your code here
import java.util.Scanner;
public class Program6{
    public static void main(String[] args){
        final double pi = 3.14159;
        double radius = 0.0;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = numScanner.nextDouble();
        double diameter = 2*radius;
        double circumference = 2*pi*radius;
        double area = pi*radius*radius;
        radius = radius*1000;
        radius += 0.555;
        radius = (int)radius;
        radius = (double)radius/1000;
        diameter *= 1000;
        diameter += 0.555;
        diameter = (int)diameter;
        diameter = (double)diameter/1000;
        circumference *=1000;
        circumference += 0.555;
        circumference = (int)circumference;
        circumference = (double)circumference/1000;
        area *= 1000;
        area += 0.555;
        area = (int)area;
        area = (double)area/1000;
        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);
    }
}



//Paste console output below:
/*
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Circumference of the circle = 23.323

*/
