import java.lang.*;
import java.util.*;

class AP52
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Row");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the Number of Column");
        int iValue2 = sobj.nextInt();

        Demo dobj = new Demo(iValue1, iValue2);

        dobj.Display();
    }



}

class Demo
{
    public int iRow;
    public int iCol;

    public Demo(int a, int b)
    {
        iRow = a;
        iCol = b;
    }


    public void Display()
    {
        if(iRow != iCol)
        {
            System.out.println("Invalied Input");
            return;
        }
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i < j)
                {
                    System.out.print("*\t");
                }
                else if(i == j)
                {
                    System.out.print("$\t");
                }
                else if(i > j)
                {
                    System.out.print("@\t");
                }
               
               
            }
            System.out.println("");
        }
        
    }



}


