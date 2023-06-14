import java.lang.*;
import java.util.*;

class JL56
{
    public static void main(String a[])
    {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iValue);

        aobj.Accept();
        aobj.Display();
        bRet = aobj.ChkPefect();
        if(bRet == true)
        {
            System.out.print("Array Contain Perfect Number : ");
        }
        else
        {
            System.out.println("Unble to Present Perfect Number");

        }



    }
}

class Arithmatic
{
    public int iNo;
    public int Arr[];

    public Arithmatic(int a)
    {
        this.iNo = a;
        Arr = new int [iNo];

    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elemetnts");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();

        }
    }
    public void Display()
    {
        System.out.println("Array is :");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public boolean ChkPefect()
    {
        boolean bFlag = false;
        int iSum = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            for(int iCnt2 = 1; iCnt2 <= (Arr[iCnt] /2); iCnt2++)
            {
                if(Arr[iCnt] % iCnt2 == 0)
                {
                    iSum = iSum + iCnt2;

                }
               
            }
             if(iSum == Arr[iCnt])
            {
                
                bFlag = true;
                break;

            }
            iSum = 0;
          
        }

        return bFlag;
         
        
    }

  

}


