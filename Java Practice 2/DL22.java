import java.lang.*;
import java.io.*;

class DL22
{
    public static void main(String arg[])
    {

        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        try
        {
            
            System.out.println("Enter Your Name");
            String name = bobj.readLine();

            System.out.println("Enter Your Age");
            int iNo = Integer.parseInt(bobj.readLine());

            System.out.println("Enter your Percentage");
            float fper = Float.parseFloat(bobj.readLine());
        }
        catch(IOException obj)
        {
            System.out.println(obj);
        }    
       finally
       {
        iobj = null;
        bobj = null;
       } 
           

    }

}