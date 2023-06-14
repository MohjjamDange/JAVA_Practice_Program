import java.lang.*;
import java.util.*;

class JL118
{
    public static void main(String a[])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter the Length of Array ");
        int iLength = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iLength);

        aobj.Accept();
        int iRet = aobj.DisplaySummetion();
        System.out.println("Summetion of All Elements is :"+iRet);
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

    public int DisplaySummetion()
    {
        int iSum = 0;
        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
            

        }
            return iSum;
    }
}


