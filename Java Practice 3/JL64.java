import java.lang.*;
import java.util.*;


class JL64
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");
        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            System.out.print(Arr[iCnt]);
        }




    }
}