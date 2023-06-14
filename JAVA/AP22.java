import java.lang.*;
import java.util.*;

class AP18
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new  Arithmatic();
        int iRet = aobj.DisplayEvenDigit(iValue);
        System.out.println("Total Number of Even Digit is :"+iRet);
        
                
    }
}

class Arithmatic
{
    public int DisplayEvenDigit(int iNo)
    {
        int iDigit = 0,iCount = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        System.out.println("Even Number is :");
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit%2 == 0)
            {
                System.out.println(iDigit);
                iCount++;
            }

            iNo = iNo/10;
        }
        return iCount;


    }

   
      
  
}


