import java.lang.*;
import java.util.*;

class JL41
{
    public static void main(String arg[])
    {
        boolean bret = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int iValue = sobj.nextInt();

        Arithamtic aobj = new Arithamtic(iValue);
       bret= aobj.ChkPrime();
       if(bret == true)
       {
            System.out.println("Given Number is not Prime");

       }
       else
       {
            System.out.println("Given number is Prime");
       }
       
    }

}


class Arithamtic
{
    public int iNo;

    public Arithamtic(int a)
    {
        this.iNo = a;

    }

    public boolean ChkPrime()
    {
        boolean bFlag = false;
        for(int iCnt = 2; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = true;
            }
           
        }

        return bFlag;

    }
}


