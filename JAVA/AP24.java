import java.lang.*;
import java.util.*;

class AP24
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        int iRet = aobj.ReversDigit(iValue);
        System.out.println("Revers Number is :"+iRet);

    }
}

class Arithmatic
{
    public int ReversDigit(int iNo)
    {
        int iRev = 0, iDigit = 0;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        return iRev;
    }
}

