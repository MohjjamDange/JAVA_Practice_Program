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
        int iRet = aobj.DisplayMax();
        System.out.println("Maximum Number from Array is :"+iRet);
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

    public int DisplayMax()
    {
        int iMax = 0;
        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
           if(iMax < Arr[iCnt])
           {
                iMax = Arr[iCnt];
           }          
        }
            return iMax;
    }
}


