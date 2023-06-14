import java.lang.*;
import java.util.*;

class DL15
{
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the Length of Array :");
      int iLength = sobj.nextInt();

      int Arr[] = new int[iLength];

      System.out.println("Enter the Elements of Array");
      for(int iCnt = 0; iCnt < Arr.length; iCnt++)
      {
        Arr[iCnt] = sobj.nextInt();
      
      }

      System.out.println("Array is :");

      for(int iCnt = 0; iCnt < Arr.length; iCnt++)
      {
        System.out.println(Arr[iCnt]);
      }

    }
}