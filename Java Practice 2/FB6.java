import java.lang.*;
import java.util.*;

class FB5
{
    public static void main(String a[])
    {
        System.out.println("Enter the Length of Array ");
        Scanner sobj = new Scanner(System.in);
        int iNo = sobj.nextInt();

        Demo dobj = new Demo(iNo);

        dobj.Accept();
        int iRet = dobj.Summetion();
        System.out.println("Summetion of All Element of Array is :"+iRet);

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

    public int Summetion()
    {
        int iSum = 0;
        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
           
        }

        return iSum;

    }


}


