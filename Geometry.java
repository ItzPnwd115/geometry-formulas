
/**
 * Write a description of class Geometry here.
 * 
 * @author Sean Donlin 
 * @version 8/30/17
 */
public class Geometry 
{
    
    /**
     * Calculates area of a triangle.
     * @param base  Base of the traingle.
     * @param height  Height of the triangle.
     * @return Area of triangle.
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    /**
     * Calculates area of a rectangle.
     * @param length  length of rectangle.
     * @param width  width of rectangle.
     * @return Area of rectangle.
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates volume of a sphere.
     * @param radius  radius of sphere.
     * @return Volume of sphere.
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * Calculates area of a parallelogram.
     * @param base  base of parallelogram.
     * @param height  height of parallelogram.
     * @return Area of parallelogram.
     */
    public static double parallelogramArea(double base, double height)
    {
        double area = base * height;
        
        return area;
    }
    
    /**
     * Calculates area of a trapezoid.
     * @param abase  first base of a trapezoid.
     * @param bbase  second base of a trapezoid.
     * @param height  height of trapezoid.
     * @return Area of trapezoid.
     */
    public static double trapezoidArea(double abase, double bbase, double height)
    {
        double area = abase + bbase / 2.0 * height;
        
        return area;
    }
    
    /**
     * Calculates volume of a rectangular prism.
     * @param width  width of prism.
     * @param length  length of prism.
     * @param height  height of prism.
     * @return Volume of prism.
     */
    public static double prismVolume(double width, double length, double height)
    {
        double volume = width * length * height;
        
        return volume;
    }
    
    /**
     * Calculates volume of a cone.
     * @param radius  radius of the cone.
     * @param height  height of the cone.
     * @return Volume of cone.
     */
    public static double coneVolume(double radius, double height)
    {
        double volume = Math.PI * Math.pow(radius, 2) * height / 3.0;
        
        return volume;
    }
    
    /**
     * Calculates surface area of a prism.
     * @param width  width of prism.
     * @param height  height of prism.
     * @param length  length of prism.
     * @return Surface area of prism.
     */
    public static double prismSA(double width, double height, double length)
    {
        double SA = 2 * width * height + 2 * height * length + 2 * length * width;
        
        return SA;
    }
    
    /**
     * Calculates surface area of a sphere.
     * @param radius  radius of the sphere.
     * @return Surface area of a sphere.
     */
    public static double sphereSA(double radius)
    {
        double SA = 4 * Math.PI * Math.pow(radius, 2);
        
        return SA;
    }
    
    /**
     * Calculates the hypotenuse of a right triangle.
     * @param a  a side of right triangle.
     * @param b  b side of right triangle.
     * @return Length of side c.
     */
    public static double hypotenuseRT(double a, double b)
    {
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        double RT = Math.sqrt(c);
        
        return RT;
    }
    
    /**
     * Calculates distance between two points.
     * @param x1  x1 corodinates on a graph.
     * @param y1  y1 corodinates on a graph.
     * @param x2  x2 corodinates on a graph.
     * @param y2  y2 corodinates on a graph.
     * @return Distance between two points.
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
     * Calculates slope of a graph
     * @param x1  x1 corodinates on a graph.
     * @param y1  y1 corodinates on a graph.
     * @param x2  x2 corodinates on a graph.
     * @param y2  y2 corodinates on a graph.
     * @return Slope of graph.
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
