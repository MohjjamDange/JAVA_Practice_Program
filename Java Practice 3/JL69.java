import java.io.*;
import java.lang.*;
import java.util.*;


class JL69
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First String");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Second String");
        String str2 = sobj.nextLine();

        char Arr[] = (str1.toLowerCase()).toCharArray();
        char Brr[] = (str2.toLowerCase()).toCharArray();
        if(Array.equals(Arr,Brr))
        {
            System.out.println("String is Anagram");
        }
        else
        {
            System.out.println("String is NOt Anagram");
        }



    }




}
