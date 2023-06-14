import java.lang.*;

class DL27
{
    public static void main(String arg[])
    {
        String str1 = "Hello";
        String str2 = "world";

        String str3 = new String("Marvellous");

        if(str1 == str2)
        {
            System.out.println("Data is Same");
        }
        else
        {
            System.out.println("Data is Diffrent");
        }

        if(str1.equals(str3))
        {
            System.out.println("Data is same");
        }
        else
        {
            System.out.println("Data is Diffrent");
        }
    }

}