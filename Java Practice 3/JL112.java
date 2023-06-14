import java.lang.*;
import java.util.*;

class JL112
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter The Base");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Power");
        int iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();

        int iRet = aobj.multiplcation(iNo1,iNo2);
        System.out.println("Answer is :"+iRet);

    }

}

class Arithmatic
{
    public int multiplcation(int iBase,int iPower)
    {
        int imult = 1;
        for(int i = 1; i < iPower;i++)
        {
            imult = imult * iBase;
        }

        return imult;
    }

}


