import java.lang.*;
import java.util.*;

class JL43
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Value");
        int iValue = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iValue);

        int iRet = aobj.SumEvenDigit();
        System.out.println("Summetion of All Sum Digit : "+iRet);
        
       
    }

}

class Arithmatic
{
    public int iNo;

    public Arithmatic(int a)
    {
        this.iNo = a; 
    }

    public int SumEvenDigit()
    {
        int iDigit = 0;
        int iSum = 0;
      
        while(iNo != 0)
        { 
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
               iSum = iSum + iDigit;

            }
            
            iNo = iNo / 10;
        }

        return iSum;

          
    }
}