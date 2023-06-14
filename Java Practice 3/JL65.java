import java.lang.*;
import java.io.*;
import java.util.*;


class JL56
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        String strX = str.replaceAll("\\s+"," ");
        String Arr[] = strX.split(" ");

        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            System.out.print(Arr[iCnt]);
        }


    }

}