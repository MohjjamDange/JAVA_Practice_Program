import java.lang.*;
import java.util.*;

class AP64
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.replace(iValue);
         



    }



}

class Demo
{

    public void revers(int iNo1)
    {
        int iDigit1 = 0, iMult1 = 0;
        while(iNo1 > 0)
        {
            iDigit1 = iNo1 % 10;
            iMult1 = (iMult1 * 10) + iDigit1; 
            iNo1 = iNo1 / 10;        

        }

        System.out.println("Current Number is :"+iMult1);



    }
    public void replace(int iNo)
    {
        int iDigit = 0, iMult = 0;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                iDigit = 5;
            }
            iMult = (iMult*10) + iDigit;
            iNo = iNo / 10;

        }

        this.revers(iMult);

    }


}

