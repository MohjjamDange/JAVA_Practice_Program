import java.lang.*;
import java.util.*;

class FB1
{
    public static void main(String a[])
    {
        Arithmatic aobj = new Arithmatic();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        boolean bRet = aobj.ChkArmStroung(iNo);
        if(bRet == true)
        {
            System.out.println("Given Number is ArmStroung");
        }
        else
        {
            System.out.println("Given Number is Not ArmStroung");
        }
       

    }

}


class Arithmatic
{
    public int power(int iBase, int iPower)
    {
        int iMult = 1;

        for(int iCnt = 1; iCnt <= iPower; iCnt++)
        {
            iMult = iMult * iBase;
        }

        return iMult;
    }




    public boolean ChkArmStroung(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        int itemp = iNo;
        int iCount = 0;

        while(iNo != 0)
        {
            iCount++; 
            iNo = iNo / 10;
        }
        iNo = itemp;


        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + power(iDigit, iCount);
            iNo = iNo / 10;
        }   

        if(iSum == itemp)
        {
            return true;
        }    
        else
        {
            return false;
        }

    }
    
} 


