import java.lang.*;
import java.util.*;


class JL52
{
    public static void main(String a[])
    {
        boolean bret = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iValue); 

        bret = aobj.ArmStrong();
        if(bret == true)
        {
            System.out.println("Given Number is ArmStrong");
        }
        else
        {
            System.out.println("Given NUmber is Not ArmStrong");
        }
    }

}

class Arithmatic
{
    public int iNo;

    public Arithmatic(int a)
    {
        this.iNo = a;
    }

    public int power(int iBase,int iPower)
    {
        int iMult = 1;
        for(int iCnt = 1; iCnt <= iPower; iCnt++)
        {
            iMult = iMult * iBase;

        }
        return iMult;
    }

    public boolean ArmStrong()
    {
        int temp = iNo;
        int iDigit = 0;
        int CountDigit = 0;
        int iSum = 0;

        while(iNo > 0)
        {
            CountDigit++;
            iNo = iNo /10;
        }

        iNo = temp;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + power(iDigit, CountDigit);
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
} 