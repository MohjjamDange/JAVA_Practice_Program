import java.lang.*;
import java.util.*;

class JL53
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array :");
        int iLength = sobj.nextInt();

        Demo dobj = new Demo(iLength);

        dobj.Accept();
        dobj.Display();
    }
}

class Demo
{
    public int iSize;
    public int Arr[];

    public Demo(int a)
    {
        this.iSize = a;
        this.Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements of Array :");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();

        }
    } 

    public void Display()
    {
        System.out.println("Elemnets is :");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}