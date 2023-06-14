import java.lang.*;
import java.util.*;

class AP33
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of row");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of coloumn");
        int iCol = sobj.nextInt();


        int arr[][] = new int[iRow][iCol];

        System.out.println("Enter the Elements of Array :");

        for(int iCnt1 = 0; iCnt1 < arr.length; iCnt1++)
        {
            for(int iCnt2 = 0; iCnt2 < arr[iCnt1].length; iCnt2++)
            {
                arr[iCnt1][iCnt2] = sobj.nextInt();
                
            }

        }

        System.out.println("Elements is :");

        for(int iCnt1 = 0; iCnt1 < arr.length; iCnt1++)
        {
            for(int iCnt2 = 0; iCnt2 < arr[iCnt1].length; iCnt2++)
            {
                System.out.print(arr[iCnt1][iCnt2]+" ");
                
            }
            System.out.println("");

        }





       




    }

}
