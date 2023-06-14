import java.lang.*;
import java.util.*;


class AP85
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iWeight =sobj.nextInt();

        switch(iWeight)
        {
            case 1:
                System.out.println("gold rate is 5000");
                break;

            case 5:
                System.out.println("gold rate is 1000");
                break;

            case 7:
                System.out.println("gold rate is 15000");
                break;
            default:
                System.out.println("Invalied Input");
                break;        


        }
             
        
    }



}