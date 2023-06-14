import java.lang.*;
import java.util.*;

class JL51
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Base");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Power");
        int iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iNo1, iNo2);

        int iRet = aobj.power();
        System.out.println("Answer is :"+iRet);

    }

}

class Arithmatic
{
    public int iBase;
    public int iPower;

    public Arithmatic(int a,int b)
    {
        this.iBase = a;
        this.iPower = b;
    }

    public int power()
    {
        int iMult = 1;

            for(int j = 1; j <= iPower; j++)
            {
                iMult = iMult * iBase;

            }

            return iMult;
    }




}