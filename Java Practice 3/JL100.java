import java.lang.*;
import java.util.*;


class JL98
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number");
        int iNo = sobj.nextInt();

        String str = Integer.toString(iNo);

        char Arr[] = str.toCharArray();

        for(int i = Arr.length; i >= 0; i--)
        {
            for(int j = 0; j < i;j++)
            {
                System.out.print(Arr[j]+"\t");
            }
            System.out.println("");
        }   

    }
}