import java.lang.*;
import java.util.*;

class AP48
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the NUmber");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        boolean bRet = aobj.Display(iValue);
       if(bRet == true)
       {
        System.out.println("Given Number ArmStroung");
       }
       else
       {
        System.out.println("Given Not Number ArmStroung");
       }
    }    
        




}

class Arithmatic
{
    public boolean Display(int iNo)
    {
       int iDigit = 0,iRev = 0,iTemp = 0;
        iTemp = iNo;
       while(iNo > 0)
       {
        iDigit = iNo%10;
        iRev = (iRev * 10) + iDigit;
        iNo = iNo / 10;

       }

       if(iTemp == iRev)
       {
            return true;
       }
       else
       {
            return false;
       }


    }



}

