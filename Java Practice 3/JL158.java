import java.lang.*;
import java.util.*;


class JL158
{
    public static void main(String a[])
    {
        HashMap<String, Integer> hobj = new HashMap<String, Integer>();

        hobj.put("Rahul", 15);
        hobj.put("Raju",16);
        hobj.put("Sahil",45);
        hobj.put("Bk",99);
        hobj.put("Sk",07);

       System.out.println("KeySet is :"+hobj.keySet()); // show All key from hashmap
       System.out.println("Values :"+hobj.values());//show all value from hash map
       System.out.println("All Hashmap : "+hobj.entrySet()); // show keys and value  in pair from hash map

       Iterator<String> iobj = hobj.keySet().iterator(); //here setEntry() we cant use for ireration perpose;

       while(iobj.hasNext())
       {
        System.out.println(iobj.next());
       }

       
        




    }

}