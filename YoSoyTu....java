import java.util.Scanner;

class YoSoyTu...
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in)
        int numberPairs = sc.NextInt();
        
        for (int i = 0; i < numberPairs*2; i++)
        {
            String name = sc.NextLine();
            String relationship = sc.NextLine();
            
            if (name.equals("Luke") && relationship.equals("padre")
                System.out.println("TOP SECRET");
            
            else 
                System.out.println(name + ", yo soy tu" + relationship);
        }
    }
    
}
