import java.lang.*;
import java.util.*;

class JL116
{
    public static void main(String a[])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter the Length of Array ");
        int iLength = sobj.nextInt();

        System.out.println("Enter the Number Which you want to Check :");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iLength);

        aobj.Accept();
        int iRet = aobj.ChkFrequency(iValue);
        System.out.println("Frequency of "+iValue+" is in Array : "+iRet+" times");


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

    public int ChkFrequency(int iNo)
    {
        int iCount = 0;
        System.out.println("Array is :");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iCount++;
            }
          
        }
        return iCount;

    }
}


