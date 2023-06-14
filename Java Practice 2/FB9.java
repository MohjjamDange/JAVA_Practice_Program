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
        int iRet = dobj.FindMin();
        System.out.println("Minimum Number from Array is:"+iRet);

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

    public int FindMin()
    {
       int iMin = 0;
       int iCnt = 0;
       iMin = Arr[iCnt];

        for(iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if(iMin > Arr[iCnt])
            {
                iMin = Arr[iCnt];
            }

        }

        return iMin;


    }


}


