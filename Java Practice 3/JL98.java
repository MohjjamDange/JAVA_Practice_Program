import java.lang.*;
import java.util.*;


class JL98
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr.length; j++)
            {
                if(i >= j)
                {
                    System.out.print(Arr[j]+"\t");
                }
                else
                {
                    System.out.print(" \t");
                }


            }
            System.out.println("");

        }
    
       for(int i = Arr.length;i>=0; i--)
       {
            for(int j = 0; j < i; j++)
            {
                System.out.print(Arr[j]+"\t");
            }

            System.out.println("");
       }   
      

    }
}