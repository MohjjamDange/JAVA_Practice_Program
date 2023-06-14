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
        int iRet = aobj.SumDigit(iValue);
        System.out.println("Summetion of Digit is:"+iRet);
       
                
    }
}

class Arithmatic
{
    public int SumDigit(int iNo)
    {
        int iDigit = 0,iSum = 0;
        
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;

        }
        return iSum;


    }
    
}


