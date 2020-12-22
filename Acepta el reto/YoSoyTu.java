import java.util.Scanner;

public class YoSoyTu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int numberPairs = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < numberPairs; i++)
        {
            String name = sc.nextLine();
            String relationship = sc.nextLine();
            
            if (name.equals("Luke") && relationship.equals("padre"))
            {
                System.out.println("TOP SECRET");
            }
            
            else 
            {    
                System.out.println(name + ", yo soy tu " + relationship);
            }
        }
    }
    
}
