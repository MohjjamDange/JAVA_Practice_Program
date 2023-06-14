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
        dobj.revers();

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

    public void revers()
    {
       
       
        System.out.println("Revers Elements of Array");

        for(int iCnt = Arr.length -1; iCnt >= 0 ; iCnt--)
        {
            System.out.println(Arr[iCnt]);
        }

    }


}


