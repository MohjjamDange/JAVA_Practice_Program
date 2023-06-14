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
        boolean bRet = aobj.ChkPrime(iNo);
        if(bRet == true)
        {
            System.out.println("Given NUmber is Prime NUmber");
        }
        else
        {
            System.out.println("Given Number is Not Prime Number");
        }

    }
}

class Arithmatic
{
    public boolean ChkPrime(int iValue)
    {
        boolean bFlag = true;
        for(int iCnt = 2; iCnt <= iValue/2; iCnt++)
        {
            if(iValue % iCnt == 0)
            {
            bFlag = false;
            break;
            }
        }
        return bFlag;
    }
}


