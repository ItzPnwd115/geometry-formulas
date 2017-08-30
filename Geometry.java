
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
     * 
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * 
     */
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * 
     */
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
