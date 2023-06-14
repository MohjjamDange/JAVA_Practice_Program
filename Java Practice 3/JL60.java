import java.lang.*;
import java.util.*;

class JL60
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        Demo dobj = new Demo(str);
        int iRet = dobj.ChkL();
        System.out.println("Friquency Of 'L' is :"+iRet);
    }

}

class Demo
{
    public String s;
    public char Arr[];

    public Demo(String Xstr)
    {
        this.s = Xstr;

    }

    public int ChkL()
    {
        int iCnt2 = 0;
        Arr = s.toCharArray();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 'l')
            {
               iCnt2++;

            }

          
        }

        return iCnt2;
    }

}


