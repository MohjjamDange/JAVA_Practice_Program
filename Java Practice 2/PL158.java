import java.lang.*;
import java.util.*;

class PL158
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Nmber");
        int iValue = sobj.nextInt();

        bitwise bobj = new bitwise();

        bobj.DisplayBitwise(iValue);


    }

}

class bitwise
{
 
    public void DisplayBitwise(int iNo)
    {
        int iDigit = 0;
       System.out.println("Binary is :");
        while(iNo != 0)
        {
           
            iDigit = iNo % 2;
            System.out.print(iDigit);
            iNo = iNo / 2;

        }

    }


}

