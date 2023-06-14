import java.lang.*;
import java.util.*;

class DL13
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Name :");
        String str = sobj.nextLine();

        System.out.println("Enter the Age");
        int iAge = sobj.nextInt();

        System.out.println("Enter the Percentage");
        float fper = sobj.nextFloat();

        System.out.println("Name of Student is :"+str);
        System.out.println("Age of Student is : "+iAge);
        System.out.println("Percentage of Student"+fper);

    }

}