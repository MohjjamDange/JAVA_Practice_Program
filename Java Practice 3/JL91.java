import java.lang.*;
import java.util.*;

class JL77
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of row");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Number of Column");
        int iNo2 = sobj.nextInt();

        Matrix mobj = new Matrix(iNo1, iNo2);
        mobj.Display();

    }

}


class Matrix
{
    public int iRow;
    public int iCol;


    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;
    }

    public void Display()
    {
        if(iRow != iCol)
        {
            System.out.println("Invalied input");
        }

        for(int i = 1;i <= iRow; i++)
        {
            for(int j = 1;j <= i;j++)
            {
                System.out.print("*\t");

            }
            System.out.println("");

        }

        for(int i = iRow-1; i>= 1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");


        }


      

        
    }


}



