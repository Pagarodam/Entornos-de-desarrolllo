/* 2.2.2.2. Create a program called SumDigits that asks the user to 
enter numbers (integer values) until he enters 0. The program must 
sum up all the numbers entered by the user and then show the final 
result, and how many digits it has. For instance, if the user types 
12, 20, 60, 33, 99 and 0, then the program must output: 
"The result is 224, and it has 3 digits" */

import java.util.Scanner;

public class SumDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int result = 0, input;
        
        do
        {
            System.out.println("Enter numbers or press 0 to show result");
            input = sc.nextInt();
            result = input + result;
        }
        while (input > 0);
        
        System.out.printf("%d", result);
    }
}
