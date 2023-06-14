import java.lang.*;
import java.util.*;


class FB16
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("\nEnter the Length Of Array");
        int iLength = sobj.nextInt();

        Demo dobj = new Demo(iLength);

        dobj.Accept();
        dobj.Display();
        dobj.sort();
        dobj.Display();

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

        System.out.println("\nEnter the Elements");

        for(int i = 0;i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

    }

    public void sort()
    {
        int temp = 0;

        System.out.println("\n sort Array is :");

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = i+1; j < Arr.length; j++)
            {
                if(Arr[i] < Arr[j])
                {
                     temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;

                }
               
               
            }

        }


    }

    public void Display()
    {
        System.out.println("Array is :");


        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+" ");
        }

    }

}


