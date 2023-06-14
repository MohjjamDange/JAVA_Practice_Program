import java.lang.*;
import java.util.*;


class AP6
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Name");
        String str = sobj.nextLine();

        System.out.println("Enter the Age");
        int iAge = sobj.nextInt();

        System.out.println("Enter the Percentage");
        float pre = sobj.nextFloat();

        System.out.println("My Name is :"+str);
        System.out.println("My Age is :"+iAge);
        System.out.println("My percentage is :"+pre);


    }



}