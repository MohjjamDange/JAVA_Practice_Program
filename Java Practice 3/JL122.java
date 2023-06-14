import java.lang.*;
import java.util.*;


class JL122
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= iNo; i++)
        {
           if(i % 2 == 0 )
           {
            System.out.print(i+"\t");
           }
           else
           {
            System.out.print("* \t");
           }
        }



    }



}