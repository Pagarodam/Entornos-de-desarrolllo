/* 2.1.6.2. Create a program called GramOunceConverter that converts 
from grams to ounces. The program will ask the user to enter a weight 
in grams (an integer number), and then it will show the corresponding 
weight in ounces (a real number), taking into account that 1 
ounce = 28.3495 grams. */

import java.util.Scanner;

public class GramOunceConverter
{
    public static void main(String[] args)
    {
        int grams;
        float ounces;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insert weight in grams");
        grams = sc.nextInt();
        ounces = grams * 28.3495f;
        
        System.out.println("The weight in ounces is " + ounces);
    }
}
