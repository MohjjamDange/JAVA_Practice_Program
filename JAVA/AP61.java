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

        dobj.ChangeUpperCase();
        
        
    }



}

class Demo
{
    public String str;

    public Demo(String a)
    {
        this.str = a;
    }

    public void ChangeUpperCase()
    {  
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A')&&(Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)((int)Arr[iCnt] + 32);

            }

        } 

        System.out.println("String is :");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]);
        }   
                  

    }

   



}

