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

      boolean bRet = aobj.Display(iNo);
      if(bRet == true)
      {
        System.out.println("Given Number is Pallendrom");
      }
      else
      {
        System.out.println("Given Number not Pallendrom");
      }
     

  }

}

class Arithmatic
{
  public boolean Display(int iNo)
  { 
    int iDigit = 0;
    int iRev = 0;


    while(iNo != 0)
    {
        iDigit = iNo % 10;
        iRev = (iRev * 10) + iDigit;
        iNo = iNo / 10;
    }  
    System.out.println("Reveres Number is :"+iRev);

    if(iNo == iRev)
    {
        return true;
    }
    else
    {
        return false;
    }    
    
  }

}


