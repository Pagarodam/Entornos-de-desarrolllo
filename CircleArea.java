/* 2.1.6.4. Create a program called CircleArea that defines a float 
constant called PI with the value 3.14159 . Then, the program will ask 
the user to enter the radius of a circle, and it will output the area 
of the circle ( PI * radius * radius). This area will be printed with 
two decimal digits. */

import java.util.Scanner;

public class CircleArea
{
    public static final float PI = 3.14159;
    
    public static void main(String[] args)
    {
        
        System.out.println("Enter the radius of a circle");
        float rad¡us =  Float.parseFloat(sc.nextFloat());
        float area = PI * radius * radius;
        System.out.printf("%.3f", area);
    }
}
