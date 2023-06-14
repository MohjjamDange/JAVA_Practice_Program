import java.lang.*;
import java.util.*;


class FB21
{
    public static void main(String a[])
      {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Length");
        int iLength = sobj.nextInt();

        Demo dobj = new Demo(iLength);

        dobj.Accept();
        dobj.Display();
        dobj.InsertionSorting();
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

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

    }

    public void Display()
    {
        System.out.println("Elements of Array");

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+" ");
        }

        System.out.print("");

    
    }

    public void InsertionSorting()
    {
        int i = 0, j = 0, selected = 0;

        for(i = 1; i < Arr.length; i++)
        {
            for(j = i-1, selected = Arr[i]; ((j >=0)&&(Arr[j] > selected)); j--)
            {
                Arr[j+1] = Arr[j];
            }
            Arr[j+1] = selected;
        }

    }




    public void SelectionSorting()
    {
       int i = 0, j = 0,temp = 0,Min_Index = 0;

       for(i = 0; i < Arr.length-1; i++)
       {
            Min_Index = i;

            for(j = i+1;j < Arr.length; j++)
            {
                if(Arr[Min_Index] > Arr[j])
                {
                    Min_Index = j;
                }
            }

            temp = Arr[i];
            Arr[i] = Arr[Min_Index];
            Arr[Min_Index] = temp;
            
       }
    }

}


