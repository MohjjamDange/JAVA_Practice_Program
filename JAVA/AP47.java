import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.IOException.*;

class AP47
{
    public static void main(String a[]) throws FileNotFoundException
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the File Name");
        String fName = sobj.nextLine();

        File fobj = new File(fName);

        Scanner sobj2 = new Scanner(fobj);

        while(sobj.hasNextLine())
        {
            String str = sobj.nextLine();
            System.out.println(str);
        }

        sobj.close();
        System.out.println("Data Succsesfully Read");     
    }

}