import java.lang.*;
import java.util.*;

class AP28
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        ArmStroung aobj = new ArmStroung();

        Boolean bRet = aobj.ChkArmStroung(iValue);
        if(bRet == true)
        {
            System.out.println("Given Number is ArmStroung");
        }
        else
        {
            System.out.println("Given Number Not ArmStroung");

        }
        

    }
}

class ArmStroung
{

    public int power(int iBase, int iPower)
    {
        int iAns = 0;

        for(int iCnt = 1; iCnt <= iPower; iCnt++)
        {
            iAns = iAns * iBase;
                        
        }
        return iAns;
    
    }


    public Boolean ChkArmStroung(int iNo)
    {
        int iTemp = iNo, iCount = 0,iDigit = 0,iSum =0;

        while(iNo > 0)
        {
            iCount++;
            iNo = iNo / 10;

        }

        iNo = iTemp;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + power(iDigit , iCount);
            iNo = iNo / 10;
        }

        if(iTemp == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }


    }

}








