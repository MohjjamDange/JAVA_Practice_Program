import java.lang.*;
import java.io.*;

class AP9
{
    public static void main(String a[])
    {
        String str = "Never Give UP";

        System.out.println("Length of Stirng is :"+str.length());

        System.out.println("String is :");

        char Arr[] = str.toCharArray();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]);
        }       



    }



}