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

        aobj.DisplayDigit();
       


    }
}

class Arithmatic
{
    public int iNo;

    public Arithmatic(int a)
    {
        this.iNo = a; 
    }

    public void Display(int a)
    {
        int iDigit = 0;
        while(a > 0)
        {
            iDigit = a % 10;
            System.out.println(iDigit);
            a = a/10;

        }
    }

    public void DisplayDigit()
    {
        int iDigit = 0;
        int iRev = 0;

       while(iNo > 0)
       {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
       }
       this.Display(iRev);
     
    }
}