import java.lang.*;
import java.util.*;


class JL71
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of Row");
        int iRow = sobj.nextInt();

        System.out.println("Enter the Number of Colume");
        int iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol); 

        mobj.Accept();
        mobj.SwapRow();
       mobj.Display();
       



    }



}

class Matrix
{
    public int irow;
    public int icol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.irow = a;
        this.icol = b;
        Arr = new int [irow][icol];
    }


    

    public void Accept()
    {
        System.out.println("Enter the Value of Array");
        Scanner sobj = new Scanner(System.in);
        for(int i = 0; i < irow; i++)
        {
            for(int j = 0; j < icol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }

        }
    }

    public void SwapRow()
        {
            int iTemp = 0;

            for(int i = 0; i < irow-1; i+=2)
            {
                for(int j = 0; j< icol;j++)
                {
                        iTemp = Arr[i][j];
                        Arr[i][j] = Arr[i+1][j];
                        Arr[i+1][j] = iTemp;
                }
            }
        }


    public void Display()
    {
        int iMax = 0;
        
        for(int i = 0; i < irow; i++)
        {
            for(int j = 0; j < icol; j++)
            {
               
                
              System.out.print(Arr[i][j]);
                

            }
            System.out.println();

        }

       

    }

}


 
 
 
 
 