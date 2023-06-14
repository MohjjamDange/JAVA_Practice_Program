import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.IOException.*;

class AP46
{
    public static void main(String a[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Name File");
        String fName = sobj.nextLine();

        FileWriter fw = new FileWriter(fName);

        System.out.println("Write the Data :");
        String data = sobj.nextLine();

        fw.write(data);

        fw.close();
        System.out.println("Data Succesfully writer");

    }



}