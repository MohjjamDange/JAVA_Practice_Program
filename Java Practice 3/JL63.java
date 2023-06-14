import java.lang.*;
import java.util.*;


class JL63
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A')&&(Arr[iCnt]<='Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }

            System.out.print(Arr[iCnt]);
        }
           
          
         
    }

}