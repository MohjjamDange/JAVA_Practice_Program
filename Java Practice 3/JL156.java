import java.lang.*;
import java.util.*;


class JL156
{
    public static void main(String a[])
    {
        Vector<Integer> vobj = new Vector<Integer>();

        vobj.add(15);
        vobj.add(27);
        vobj.add(78);
        vobj.add(85);
        vobj.add(44);

        System.out.println("Length of Array :"+vobj.size());

        Enumeration<Integer> eobj = vobj.elements();

        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }

    }
}