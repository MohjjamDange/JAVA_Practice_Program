import java.lang.*;
import java.util.*;


class JL70
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Length of Array");
        int iLength = sobj.nextInt();

        int Arr[] = new int[iLength];

        System.out.println("Enter the elements of array");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Array is");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Sorted Array is :");
        int temp = 0;
        for(int i =Arr.length -1; i >= 0 ;i--)
        {
    
            for(int j = i-1; j >= 0; j--)
            {
                if(Arr[i] > Arr[j])
                {
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;

                }


            }
  
        }

        
         for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(" ");
            System.out.print(Arr[iCnt]);
        }

        


    }

}