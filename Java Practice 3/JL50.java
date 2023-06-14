import java.lang.*;
import java.util.*;

class JL43
{
    public static void main(String a[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Value");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iValue);

        bRet = aobj.ChkPallendrom();
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
    public int iNo;

    public Arithmatic(int a)
    {
        this.iNo = a; 
    }

    public boolean ChkPallendrom()
    {
        int iDigit = 0;
        int iRev = 0;
        int iNo1 = iNo;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;

        }

        if(iRev == iNo1)
        {
            return true;
        }
        else
        {
            return false;
        }
   
    }

     
}