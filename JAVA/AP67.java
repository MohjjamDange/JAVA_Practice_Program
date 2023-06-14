import java.lang.*;
import java.util.*;


class AP67
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Length of Array");
        int iLength = sobj.nextInt();

        Demo dobj = new Demo(iLength);

        dobj.Accept();
        dobj.Display();




    }




}

class Demo
{
    public int Arr[];

    public Demo(int iSize)
    {
        Arr = new int[iSize];

    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Elements of Array");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int i = 0,j = 0,selected = 0;

        for(i = 1; i< Arr.length; i++)
        {
            for(j = i - 1, selected = Arr[i]; (j>= 0) && (Arr[j] > selected); j--)
            {
                Arr[j+1] = Arr[j];
            }

            Arr[j+1] = selected;
        }




       
        System.out.println("Sorted Array is :");
        for(int k = 0; k <  Arr.length; k++)
        {
            System.out.print(Arr[k]+" ");
        }        

    }




}