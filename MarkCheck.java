/*2.2.1.1. Create a program called MarkCheck that asks the user to 
enter 3 marks. The program must print one of these messages, depending 
on the mark values: 
All marks are greater or equal than 4
Some marks are not greater or equal than 4 
No mark is greater or equal than 4 */

import java.util.Scanner;
public class MarkCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int mark1, mark2, mark3;
        
        System.out.println("Please insert 3 marks");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        
        if (mark1 >= 4 && mark2 >= 4 && mark3 >= 4)
            System.out.println("All marks are greater or equal than 4.");
            
        else if (mark1 >= 4 || mark2 >= 4 || mark3 >= 4)
            System.out.println("Some marks are not greater or equal than 4.");
            
        else
            System.out.println("No mark is greater or equal than 4.");
    }
}
