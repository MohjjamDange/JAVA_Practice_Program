import java.lang.*;
import java.util.*;


class AP44
{
    public static void main(String a[])
    {
        Hashtable<String, Integer> hobj = new Hashtable<String ,Integer>();

        hobj.put("Ram", 15);
        hobj.put("jitu", 16);
        hobj.put("sahil",18);
        hobj.put("Bk",15);
        hobj.put("sabir",19);

        System.out.println("size is :"+hobj.size());

        System.out.println(""+hobj.get("Bk"));

        System.out.println(hobj.values());
        System.out.println(hobj.entrySet());

        Enumeration eobj = hobj.keys();

        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }

    }


}