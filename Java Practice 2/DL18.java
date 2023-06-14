import java.lang.*;
import java.util.*;

class DL18
{
    public static void main(String arg[])
    {
        int iAns = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Numer");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Number");
        int iNo2 = sobj.nextInt();
        try
        {
            iAns = iNo1 / iNo2;
        }
        catch(ArithmeticException obj)
        {
            System.out.println(obj);
        }
     

        System.out.println("Division is : "+iAns);
     }
}