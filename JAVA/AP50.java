import java.lang.*;
import java.util.*;

class AP50
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        char temp = '\u0000';
        int iPos = Arr.length-1;

        for(int iCnt = 0; iCnt < Arr.length/2; iCnt++)
        {
            temp = Arr[iCnt];
            Arr[iCnt] = Arr[iPos];
            Arr[iPos] = temp;
            iPos--;
            
        }

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }



    }


}