import java.lang.*;
import java.util.*;

class AP25
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number");
        int iValue = sobj.nextInt();

        Pallendrom pobj = new Pallendrom();

        Boolean bRet = pobj.ChkPallendrom(iValue);
        if(bRet == true)
        {
            System.out.println("Given Number is Pallendrom");
        }
        else
        {
            System.out.println("Given NUmber Not Pallenrom");
        }

    }
}

class Pallendrom
{
    public Boolean ChkPallendrom(int iNo)
    {
        int iRev = 0, iDigit = 0;
        int iNo2 = iNo;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo /10;
        }

        if(iNo2 == iRev)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

} 


