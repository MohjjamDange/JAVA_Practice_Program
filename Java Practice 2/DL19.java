import java.lang.*;
import java.util.*;

class DL19
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int Arr[] = {11,22,33,44,55};

        System.out.println("Enter Index");
        int index = sobj.nextInt();
        try
        {
            System.out.println("Element is :"+Arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            
            System.out.println(obj);
        }
        finally
        {
            sobj.close();
        }

       
    }



}