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
       for(int i  = 1; i <= iRow; i++)
       {
            for(int j = 1; j <= iCol; j++)
            {
               if(i == j)
               {
                System.out.print("$\t");
               }
               else
               {

                 System.out.print("*\t");

               }       


            }
            
            System.out.println("");
       }


    }


}



