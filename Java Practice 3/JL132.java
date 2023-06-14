 /* 
     

*/

import java.lang.*;
import java.util.*;

class JL131
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Row");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the Number of Cloumn");
        int iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern(iValue1, iValue2);

        pobj.Display();

    }

}

class Pattern
{
    public int iRow;
    public int iCol;


    public Pattern(int a, int b)
    {
        iRow = a;
        iCol = b;
    }

    public void Display()
    {
        if(iRow != iCol)
        {
            System.out.print("Invalied input");  
            return;
        }

      for(int i = 1;i< iRow; i++)
      {
        for(int j = 1; j< iCol; j++)
        {
            if(i<=j)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print(" ");
            }

        }

        System.out.println("");
      }
  
          
        
    }


}