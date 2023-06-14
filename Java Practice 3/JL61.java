import java.lang.*;
import java.util.*;


class JL61
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        String str = sobj.nextLine();


        Demo dobj = new Demo(str);

        dobj.sRevers();
        dobj.Display();

    }

}


class Demo
{
    public String s;
    public char Arr[];


    public Demo(String str)
    {
        this.s = str;
        Arr = new char[s.length()];

    }

    public void Display()
    {
        for(int iCnt = 0; iCnt< Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]);
        } 
       
    }

    public void sRevers()
    {
        char temp = '\u0000';
         Arr = s.toCharArray();
         int iLength = Arr.length - 1;
        
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(iCnt == iLength)
            {
                break;
            }
            temp = Arr[iCnt];
            Arr[iCnt] = Arr[iLength];
            Arr[iLength] = temp;
            iLength--;

        }    
    }

}


