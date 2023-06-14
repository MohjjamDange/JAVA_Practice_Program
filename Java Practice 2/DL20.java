import java.lang.*;
import java.util.*;

class DL20
{
    public static void main(String arg[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Number");
        int iNo2 = sobj.nextInt();

        Demo dobj = new Demo();
        try
        {

        iRet = dobj.Division(iNo1, iNo2);
        
        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj);
        }
        finally
        {
            sobj.close();
        }
        System.out.println("Division is :"+iRet);
        System.out.println("End the Program");
        

    }

}

class Demo
{
    public int Division(int iValue1, int iValue2) throws ArithmeticException
    {
        int iAns = 0;

        iAns = iValue1 / iValue2;
        return iAns;
    }


}

