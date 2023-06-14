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
        int iRet = aobj.DisplayDigit(iValue);
        System.out.println("Given Number of Digits is :"+iRet);
                
    }
}

class Arithmatic
{
    public int DisplayDigit(int iNo)
    {
        int iDigit = 0,iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo /10; 
            iCount++;
        }

        return iCount;
        
    }
    
}


