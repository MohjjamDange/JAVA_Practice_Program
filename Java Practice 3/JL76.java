import java.lang.*;
import java.util.*;

class JL74
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        for(int i = 0 ; i < Arr.length; i++)
        {
            for(int j = 0; j <= i;j++)
            {
                System.out.print(Arr[i]+" ");

            }

            System.out.println("");
        }

      
    }
}