import java.lang.*;
import java.util.*;
class AP62
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sobj.nextLine();

        Demo dobj = new Demo(str);

        dobj.Display();          

    }



}

class Demo
{
    public String str[];
    

    public Demo(String a)
    {
        str = a.split(" ");
     
        
    }

   
    public void Display()
    {
        String temp;
       
        int iRev = str.length - 1;
        int iRev1 = 0;
        char temp1 = '\u0000';

        for(int iCnt = 0; iCnt < str.length/2; iCnt++)
        {
            temp = str[iCnt];
            str[iCnt] = str[iRev];
            str[iRev] = temp;
            iRev--;

        }

        for(int iCnt = 0; iCnt < str.length; iCnt++)
        {
            String str1 = str[iCnt];
            char Arr[] = str1.toCharArray();
            iRev1 = Arr.length - 1;
            for(int f = 0; f < Arr.length/2; f++)
            {
                temp1 = Arr[f];
                Arr[f] = Arr[iRev1];
                Arr[iRev1] = temp1;

             
                iRev1--;
            }

            for(int i = 0;i < Arr.length; i++)
            {
                System.out.print(Arr[i]);
            }

            System.out.print(" ");
            
        }
                   
       
                  
    }


}

