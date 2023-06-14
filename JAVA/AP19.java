import java.lang.*;
import java.util.*;

class AP18
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        Arithmatic aobj = new  Arithmatic();
        int iRet = aobj.CountFact(iNo);
        System.out.println("Number of Factores is :"+iRet);
        
    }
}

class Arithmatic
{
    public int CountFact(int iValue)
    {
        int iCount = 0;

      for(int iCnt = 1; iCnt <= iValue/2; iCnt++)
      {
        if(iValue % iCnt == 0)
        {
            iCount++;
        }
      }

      return iCount;
    }
    
}


