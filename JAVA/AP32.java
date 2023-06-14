import java.lang.*;
import java.util.*;

class AP32
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of row");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of coloumn");
        int iCol = sobj.nextInt();


        int arr[][] = new int[iRow][iCol];

        System.out.println("Enter the Elements of Array");

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Array is :");
        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            System.out.print(arr[iCnt]+" ");
        }
        int iSum = 0;

        for(int iCnt = 0; iCnt < arr.length; iCnt++)
        {
            iSum = iSum + arr[iCnt];
        }

        System.out.println("Anwer is :"+iSum);






    }

}
