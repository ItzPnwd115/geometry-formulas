
/**
 * Write a description of class Geometry here.
 * 
 * @author Sean Donlin 
 * @version 8/30/17
 */
public class Geometry 
{
    
    /**
     * double is used to show a decimal!
     * 
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * Easy...
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Math.PI for 3.14.... Math.pow for an exponent, in this case 3.
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Easy...
     */
    public static double parallelogramArea(double base, double hight)
    {
        double area = base * hight;
        
        return area;
    }
    
    /**
     * Easy..
     */
    public static double trapezoidArea(double abase, double bbase, double hight)
    {
        double area = abase + bbase / 2.0 * hight;
        
        return area;
    }
    
    /**
     * Easy..
     */
    public static double prismVolume(double width, double length, double hight)
    {
        double volume = width * length * hight;
        
        return volume;
    }
    
    /**
     * Explained above.
     */
    public static double coneVolume(double radius, double hight)
    {
        double volume = Math.PI * Math.pow(radius, 2) * hight / 3.0;
        
        return volume;
    }
    
    /**
     * Any way to make this smaller?
     */
    public static double prismSA(double width, double hight, double length)
    {
        double SA = 2 * width * hight + 2 * hight * length + 2 * length * width;
        
        return SA;
    }
    
    /**
     * Explained above.
     */
    public static double sphereSA(double radius)
    {
        double SA = 4 * Math.PI * Math.pow(radius, 2);
        
        return SA;
    }
    
    /**
     * Math.sqrt for a Squareroot.
     */
    public static double hypotenuseRT(double a, double b)
    {
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        double RT = Math.sqrt(c);
        
        return RT;
    }
    
    /**
     * Took the coresponding valuse added them and set them equal to a new variable x3 and y3.
     * Set them both to the 2nd power. Made them a new variable x4 and y4.
     * Added them  together and made z1.
     * Took the square root of z1.
     */
    public static double distanceP(double x1, double y1, double x2, double y2)
    {
        double x3 = x1 + x2;
        double y3 = y1 + y2;
        double x4 = Math.pow(x3, 2);
        double y4 = Math.pow(y3, 2);
        double z1 = x4 + y4;
        double dst = Math.sqrt(z1);
        
        return dst;
    }
    
    /**
     * Simple..
     */
    public static double slope(double x1, double y1, double x2, double y2)
    {
        double x3 = x2 - x1;
        double y3 = y2 -y1;
        double m = y3 / x3;
        
        return m;
    }
    
    /**
     * Example: ta1 is defined to triangleArea which is sent to function triangleArea.
     * Then onece it is finished, it is sent to system print.
     */
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println("Triangle area 1: " + ta1);
        System.out.println();
        System.out.println("Triangle area 2: " + ta2);
        System.out.println();
        
        double sv1 = sphereVolume(5.3);
        System.out.println("Sphere volume: " + sv1);
        System.out.println();
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println("Rectangle Area: " + ra1);
        System.out.println();
        
        double pa1 = parallelogramArea(3.7, 4.3);
        System.out.println("Parallelogram area: " + pa1);
        System.out.println();
        
        double tra1 = trapezoidArea(3.6, 6.9, 4.3);
        System.out.println("Trapezoid area: " + tra1);
        System.out.println();
        
        double pv1 = prismVolume(4.5, 6.3, 2.4);
        System.out.println("Prism volume: " + pv1);
        System.out.println();
        
        double cv1 = coneVolume(2.4, 6);
        System.out.println("Cone volume: " + cv1);
        System.out.println();
        
        double psa1 = prismSA(2.4, 3.6, 2.8);
        System.out.println("Prism surface area: " + psa1);
        System.out.println();
        
        double ssa1 = sphereSA(6.6);
        System.out.println("Sphere surface area: " + ssa1);
        System.out.println();
        
        double hrt1 = hypotenuseRT(5, 9);
        System.out.println("Hypotenuse of right triangle: " + hrt1);
        System.out.println();
        
        double dst = distanceP(5, 8, 9, 5);
        System.out.println("Distance: " + dst);
        System.out.println();
        
        double m = slope (5, 4, 10, 11);
        System.out.print("Slope: " + m);
        System.out.println();
        
    }
}
