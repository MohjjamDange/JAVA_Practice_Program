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

        boolean bRet = aobj.ChkPallendrom(iNo);
        if(bRet == true)
        {
            System.out.println("Given Number is Pallendrom");
        }
        else
        {
            System.out.println("Given Number is Not Pallendrom");
        }
       

    }

}


class Arithmatic
{
    public boolean ChkPallendrom(int iNo)
    {
        int iRev = 0;
        int iDigit = 0;
        int iTemp = iNo;

        while(iNo != 0)
        {
           iDigit = iNo % 10;
           iRev = iRev * 10 + iDigit;
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


