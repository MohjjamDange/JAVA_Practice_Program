import java.lang.*;
import java.util.*;

class AP66
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

    public Demo(int a)
    {
        Arr = new int[a];

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
        int i = 0, j = 0, iMin = 0,temp = 0;;

        for(i = 0; i < Arr.length; i++)
        {
            iMin = i;
            for(j = i + 1; j < Arr.length;j++)
            {
                if(Arr[iMin] > Arr[j])
                {
                    iMin = j;
                }
            }
            temp = Arr[i];
            Arr[i] = Arr[iMin];
            Arr[iMin] = temp;
        }     
           
        System.out.println("Array Is sort by Selection sorting :");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(" "+Arr[iCnt]);
        }




    }





}


