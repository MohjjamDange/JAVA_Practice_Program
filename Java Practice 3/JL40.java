import java.lang.*;
import java.util.*;


class JL40
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        //System.out.println("Length of Array"+Arr.length);

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ' ')
            {
                Arr[iCnt] = Arr[iCnt+1];
            }
            else
            {
                for()


            }
        }

        for(int iCnt2 = 0; iCnt2 < Arr.length; iCnt2++)
        {
            System.out.print(Arr[iCnt2]);
        }
       
    }
}