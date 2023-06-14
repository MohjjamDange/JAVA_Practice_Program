import java.lang.*;
import java.io.*;

class DL21
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        System.out.println("Enter the Name");
        String str = bobj.readLine();
        System.out.println("Name is :"+str);
    }
}