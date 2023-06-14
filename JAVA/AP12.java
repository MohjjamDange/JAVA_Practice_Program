import java.lang.*;
import java.util.*;

class AP12
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        boolean bRet = aobj.ChKEven(iValue);
        if(bRet == true)
        {
            System.out.println("Given Number is Even");
        }
        else
        {
            System.out.println("Given Number is Odd");
        }

    }

}

class Arithmatic
{

    public boolean ChKEven(int iNo)
    {
        if(iNo % 2 ==0)
        {
            return true;

        }
        else
        {
            return false;
        }

    }


}


