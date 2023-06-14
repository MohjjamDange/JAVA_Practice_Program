import java.lang.*;
import java.util.*;

class FB12
{
    public static void main(String a[])
    {
        System.out.println("Enter the Length of Array ");
        Scanner sobj = new Scanner(System.in);
        int iNo = sobj.nextInt();

        Demo dobj = new Demo(iNo);

        dobj.Accept();
        dobj.EleRevers();

    }

}


class Demo
{
    public int Arr[];

    public Demo(int a)
    {
        Arr = new int[a];

    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Element of Array");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public int revers(int iNo)
    {
        int iDigit = 0,iRev = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }

        return iRev; 
    }

    public void EleRevers()
    {
        System.out.println("Revers Array Elemnets is :");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = revers(Arr[iCnt]);

            System.out.println(Arr[iCnt]);
        }
              

    }


}


