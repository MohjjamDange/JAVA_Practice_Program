import java.lang.*;
import java.util.*;

class JL43
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Value");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iValue);

        int iret = aobj.CountFact();
        System.out.println("Total Number of Factors is : "+iret);


    }
}

class Arithmatic
{
    public int iNo;

    public Arithmatic(int a)
    {
        this.iNo = a; 
    }

    public int CountFact()
    {
        int iCnt2 = 0;
        for(int iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCnt2++;
            }
        }
        return iCnt2;

    }


}