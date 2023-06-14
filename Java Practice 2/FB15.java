/*
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *

*/

import java.lang.*;
import java.util.*;

class FB13
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Row");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Number of cloumn");
        int iNo2 = sobj.nextInt();

        Pattern pobj = new Pattern(iNo1, iNo2);

        pobj.Display();


    }

}


class Pattern
{
    public int iRow;
    public int iCol;

    public Pattern(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;  
        
    }

    public void Display()
    {
        if(iRow != iCol)
        {
            System.out.println("Invalied Input");
            return;
        }
        for(int i = 1;i <= iRow; i++)
        {
            for(int j = iCol; j >=1; j--)
            {
                if(i>= j)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }  
            }
            System.out.println("");

        }
       

        for(int i = 1; i<= iRow;i++)
        {
            for(int k = 1; k <= i;k++)
            {
                System.out.print("  ");
            }

            for(int j = 1; j <=(iRow - i);j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
           

        }
      

    }

}


