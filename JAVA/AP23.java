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
        int iRet = aobj.SumEvenDigit(iValue);
        System.out.println("Summetion of Even Digit is :"+iRet);
        
                
    }
}

class Arithmatic
{
    public int SumEvenDigit(int iNo)
    {
        int iDigit = 0,iCount = 0,iSum = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit%2 == 0)
            {
                iSum = iSum + iDigit;
              
            }

            iNo = iNo/10;
        }
        return iSum;

    }

   
      
  
}


