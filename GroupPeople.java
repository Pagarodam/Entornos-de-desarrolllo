/* 2.2.2.1. Create a program called GroupPeople that asks the user to 
enter how many people is going to attend to a conference. The program 
must create groups of (preferably) 50 people. Whenever this is not 
possible, then it will attempt to create groups of 10 people, and 
finally it will create groups of 1 person. The program must output how 
many groups of each category are necessary. For instance, if 78 people 
are going to attend to the conference, then we need 1 group of 50 
people, 2 groups of 10 people and 8 groups of 1 people. */

import java.util.Scanner;

public class GroupPeople
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int fifties = 0, tens = 0, single = 0;
        
        System.out.println("How many people is going to attend to a"
            + "conference?");
        int answer = sc.nextInt();
        
        while (answer >= 50)
        {
            answer = answer - 50;
            
            fifties++;
        }
        while (answer >= 10)
        {
            answer = answer - 10;
            tens++;
        }
        while (answer >= 1)
        {
            answer = answer - 1;
            single++;
        }
        
        System.out.printf("There are %d group/s of 50, %d of tens and"
            + " %d of singles.", fifties, tens, single);
               
        
        
    }
}
