import java.lang.*;
import java.util.*;

class JL112
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Number");
        int iNo1 = sobj.nextInt();

      

        Arithmatic aobj = new Arithmatic();

        boolean bRet = aobj.ChkArmStrong(iNo1);
        if(bRet == true)
        {
            System.out.println("Number is ArmStrong");
        }
        else
        {
            System.out.println("Number is Not ArmStrong");
        }
        

    }

}

class Arithmatic
{
    public boolean ChkArmStrong(int iNo)
    {
        int iCount = 0,temp = 0;
        int iDigit = 0,iSum = 0;
        temp = iNo;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;       
        }
        iNo = temp;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + (power(iDigit,iCount));
            iNo = iNo / 10;

        }

        if(iSum == temp)
        {
            return true;
        }
        else
        {
            return false;
        }    
    }


    public int power(int iBase, int iPower)
    {
        int iMult = 1;
        for(int i = 1; i <= iPower;i++)
        {
            iMult = iMult * iBase;
        }

        return iMult;

    }
   

}


