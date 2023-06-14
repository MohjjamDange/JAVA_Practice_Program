import java.lang.*;
import java.util.*;

class FB1
{
    public static void main(String a[])
    {
        Arithmatic aobj = new Arithmatic();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Base Value");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Power Value");
        int iNo2 = sobj.nextInt();

        int iAns = aobj.power(iNo1, iNo2);
        System.out.println("Answer is :"+iAns);
          
    }

}


class Arithmatic
{
    public int power(int iBase, int iPower)
    {
        int iMult = 1;
        for(int iCnt = 1; iCnt <= iPower; iCnt++)
        {
            iMult = iMult * iBase;

        }

        return iMult;       
    }
    
} 


