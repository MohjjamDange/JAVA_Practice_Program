import java.lang.*;
import java.util.*;

class JL116
{
    public static void main(String a[])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter the Length of Array ");
        int iLength = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iLength);

        aobj.Accept();
        aobj.DisplayEven();
    }

}

class Arithmatic
{
    public int Arr[];
    public int iSize;

    public Arithmatic(int a)
    {
        iSize = a;
        Arr = new int [iSize]; 
        
    }

    public void Accept()
    {
        System.out.println("Enter the Elements of Array :");
        Scanner sobj = new Scanner(System.in);
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt(); 
        }
    }

    public void DisplayEven()
    {
        System.out.println("Even Elements from Array :");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                System.out.println(Arr[iCnt]);
            }

        }

    }
}


