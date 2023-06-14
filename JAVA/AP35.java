import java.lang.*;
import java.io.*;


class AP35
{
    public static void main(String a[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter the Name");
        String str = bobj.readLine();

        System.out.println("Enter Your Age");
        int iAge = Integer.parseInt(bobj.readLine());

        System.out.println("Enter Your Percentage");
        float fPer = Float.parseFloat(bobj.readLine());

        System.out.println("My Age is :"+iAge);
        System.out.println("My Percentage is :"+fPer);

    }

}