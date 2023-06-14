import java.lang.*;
import java.util.*;



class JL62
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String");
         String str = sobj.nextLine();   

         for(int iCnt = str.length() -1; iCnt >= 0; iCnt--)
         {
            System.out.print(str.charAt(iCnt));

         }

    }



}