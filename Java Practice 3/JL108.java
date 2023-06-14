import java.lang.*;
import java.util.*;

class JL108
{
  
  public static void main(String a[])
  {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the Number");
      int iNo = sobj.nextInt();

      Arithmatic aobj = new Arithmatic();

      int iRet = aobj.Display(iNo);
      System.out.println("Summetion of Sum Digit :"+iRet);

  }

}

class Arithmatic
{
  public int Display(int iNo)
  {   
    int iDigit = 0,iSum = 0;

    while(iNo != 0)
    {
      iDigit = iNo % 10;
      if(iDigit % 2 == 0)
      {
        iSum = iSum + iDigit;
      }
      iNo = iNo/10; 

    }

    return iSum;
    
  }

}


