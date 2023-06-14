import java.lang.*;
import java.util.*;

class AP16
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        Arithamtic aobj = new Arithamtic();
        aobj.DisBFact(iNo);
      

    }

}

class Arithamtic
{
    public void DisBFact(int iValue)
    {
        System.out.println("Factor is :");
        for(int iCnt = iValue/2; iCnt >= 1; iCnt--)
        {
            if(iValue % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
       
    }


}
