import java.lang.*;
import java.io.*;
import java.util.*;


class JL56
{
    public static void main(String a[])
    {
        int iMax = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

      
        String strXX = str.trim();
        strXX = strXX.revers();

        for(int iCnt = 0; iCnt < strXX.length;iCnt++)
        {
            System.out.println(str.charAt(iCnt));
           
        }

      
       

        

    }

}