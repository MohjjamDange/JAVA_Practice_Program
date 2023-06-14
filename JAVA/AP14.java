import java.lang.*;
import java.util.*;

class AP13
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Arithamtic aobj = new Arithamtic();

       boolean bRet = aobj.ChkDiv(iValue);
       if(bRet == true)
       {
         System.out.println("Given Number is Divisible of 3 and 5 ");
       }
       else
       {
         System.out.println("Given Number Not Divisible of 3 and 5 ");

       }
    }
        
    
}

class Arithamtic
{
    public boolean ChkDiv(int iNo)
    {
        if((iNo % 3 == 0) && (iNo % 5 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
        
     
    }

}

