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

    public void DisplayDigit()
    {
        int iDigit = 0;
        while(iNo != 0)
        { 
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}