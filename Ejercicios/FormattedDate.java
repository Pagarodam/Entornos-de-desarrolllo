/* 2.1.6.1. Create a program called FormattedDate with a class with the 
same name inside. The program will ask the user to enter the day, month 
and year of birth (all values are integers). Then, it will print his 
birth date with the format d/m/y. For instance, if the user types 
day = 7, month = 11, year = 1990, the program will output 7/11/1990. */

import java.util.Scanner;

public class FormattedDate
{
    public static void main(String[] args)
    {
        int day, month, year;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce day, month and year");
        System.out.println("Day: ");
        day = sc.nextInt();
        System.out.println("Month: ");
        month = sc.nextInt();
        System.out.println("Year: ");
        year = sc.nextInt();
        
        System.out.printf("%d/%d/%d ", day, month, year);
        
    }
}
