import java.lang.*;
import java.util.*;




class AP7
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Elements of Array");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Array is :");

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(" "+Arr[i]);
        }

    }

}