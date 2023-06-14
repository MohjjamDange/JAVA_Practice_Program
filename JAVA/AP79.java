import java.io.*;
import java.lang.*;


class AP79
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter the Name");
        String str = bobj.readLine();

        System.out.println("Enter your Age");
        int iAge = Integer.parseInt(bobj.readLine());

        System.out.println("Enter your Percentage");
        float fPer = Float.parseFloat(bobj.readLine());

        System.out.println("My Name is :"+str);
        System.out.println("My Age is : "+iAge);
        System.out.println("My Percentage is:"+fPer);





    }

}