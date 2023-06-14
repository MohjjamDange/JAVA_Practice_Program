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
         String Arr[] = strXX.split(" ");

        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if(Arr[iCnt].length() > iMax)
            {
                iMax = Arr[iCnt].length();
            }
        }

        System.out.println("Maximum Length KeyWord is :"+iMax);
       

        

    }

}