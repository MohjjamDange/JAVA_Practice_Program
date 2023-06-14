import java.lang.*;
import java.util.*;

class AP8
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Row");
        int iRow = sobj.nextInt();

        System.out.println("Enter the Column");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter the Element of Array");

        for(int iCnt = 0; iCnt < iRow; iCnt++)
        {
            for(int iCnt2 = 0; iCnt2 < iCol; iCnt2++)
            {
                Arr[iCnt][iCnt2] = sobj.nextInt();
            }

        }

        System.out.println("Array is :");

         for(int iCnt = 0; iCnt < iRow; iCnt++)
        {
            for(int iCnt2 = 0; iCnt2 < iCol; iCnt2++)
            {
                System.out.print(Arr[iCnt][iCnt2]+" ");
            }
            System.out.println("");


        }
    }




}