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
    public String str1;

    public Demo(String a)
    {
        this.str1 = a;
    }

    public void Display()
    {
        char Arr[] = str1.toCharArray();
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A')&& (Arr[iCnt] < 'Z'))
            {
                Arr[iCnt]=(char)((int)Arr[iCnt]+32);
            }
            else if((Arr[iCnt] >= 'a')&&(Arr[iCnt]<='z'))
            {
                Arr[iCnt] = (char)((int)Arr[iCnt]-32);
            }
        }

        System.out.println("String is :");

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]);
        }
    }


}

