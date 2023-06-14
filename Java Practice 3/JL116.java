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
        aobj.Display();




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

    public void Display()
    {
        System.out.println("Array is :");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }
}


