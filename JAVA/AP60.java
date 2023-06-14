import java.lang.*;
import java.util.*;

class AP60
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str1 = sobj.nextLine();

        Demo dobj = new Demo(str1);

        int iRet = dobj.Display();
        System.out.println("Number of Capital Latter is String in :"+iRet);
    }



}

class Demo
{
    public String str;

    public Demo(String a)
    {
        this.str = a;
    }

    public int Display()
    {  
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A')&&(Arr[iCnt] <= 'Z'))
            {
                iCount++;

            }

        }    

        return iCount;                

    }



}

