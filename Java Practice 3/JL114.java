import java.lang.*;
import java.util.*;


class JL114
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int iSize = sobj.nextInt();

        int Arr[] = new int [iSize];

        System.out.println("Enter the Elements of Array");
        for(int i = 0; i < Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Araay Is :");
        for(int i = 0; i < Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }


    }



}