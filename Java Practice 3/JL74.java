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

        for(int i = 0; i < 5;i++)
        {
            for(int iCnt = 0; iCnt < Arr.length; iCnt++)
            {
                System.out.print(Arr[iCnt]+" ");    

            }

            System.out.println();

        }
    }
}