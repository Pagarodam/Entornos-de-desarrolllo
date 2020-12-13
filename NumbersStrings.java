/* 2.1.6.3. Create a program called NumbersStrings. This program must ask 
the user to enter 4 numbers, that will be stored in 4 String variables. 
Then, the program will join the first pair of numbers into a single 
integer value, and the second pair of numbers into another integer 
value, and then add these values. For instance, if the user types the
numbers 23, 11, 45 and 112, then the program will create a first integer 
value of 2311 and a second integer value of 45112. Then, it will add 
these two values and get a final result of 47423. */

import java.util.Scanner;

public class NumbersStrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String one, two, three, four;
        
        System.out.println("Introduce four numbers");
        one = sc.nextLine();
        two = sc.nextLine();
        three = sc.nextLine();
        four = sc.nextLine();
        
        int firstPair = one + two;
        int secondPair = (two + three);
        int result = firstPair + secondPair;
        
    }
}
