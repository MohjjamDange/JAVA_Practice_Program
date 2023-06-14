import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.IOException.*;

class AP45
{
    public static void main(String a[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the File Name");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.createNewFile())
        {
            System.out.println("File is Succesfully Created");

        }
        else
        {
            System.out.println("File Already Exist");
        }

        System.out.println(fobj.getAbsolutePath());
        System.out.println(fobj.length());
        System.out.println(fobj.getName());




    }



}