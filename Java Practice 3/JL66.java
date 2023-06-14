import java.lang.*;
import java.io.*;
import java.util.*;


class JL56
{
    public static void main(String a[])
    {
        int iCntX = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        String strX = str.replaceAll("\\s+"," ");
        String strXX = strX.trim();
         String Arr[] = strXX.split(" ");

        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            System.out.print(Arr[iCnt]);
            iCntX++;
        }
       

        

    }

}