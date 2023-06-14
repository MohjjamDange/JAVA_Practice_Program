import java.lang.*;
import java.util.*;

class AP37
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Length");
        int iSize = sobj.nextInt();
        
        Demo dobj = new Demo(iSize);

        dobj.Accept();
        int iRet = dobj.Display();
        System.out.println(iRet);


    }

}

class Demo
{
    public int Arr[];

    public Demo(int i)
    {
        Arr = new int[i];

    }

    public void Accept()
    {
        System.out.println("Enter the Elements of Array");
        Scanner sobj = new Scanner(System.in);
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

    }

    public int Display()
    {
        int iSum = 0;
        System.out.println("Addition of Even Number from Array is :");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iSum = iSum + Arr[iCnt];                
            }
            
        }

        return iSum;
    }



}

