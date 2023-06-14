import java.lang.*;
import java.util.*;

class AP40
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number of Row");
        int Row = sobj.nextInt();

        System.out.println("Enter the Number of Column");
        int Col = sobj.nextInt(); 

        Demo dobj = new Demo(Row, Col);

        dobj.Display();



    }



}

class Demo
{
    public int iRow;
    public int iCol;

    public Demo(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

    }

    public void Display()
    {

        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j<= iCol; j++)
            {
                System.out.print(i+"\t");
            }

            System.out.println("");


        }




    }



}

