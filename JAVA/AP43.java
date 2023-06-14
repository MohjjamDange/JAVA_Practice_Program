import java.lang.*;
import java.util.*;

class AP43
{
    public static void main(String a[])
    {
        ArrayList<Integer> iobj = new ArrayList<Integer>();

        iobj.add(10);
        iobj.add(20);
        iobj.add(30);
        iobj.add(40);
        iobj.add(50);

        for(int iCnt = 0; iCnt < iobj.size(); iCnt++)
        {
            System.out.print(iobj.get(iCnt)+" ");
        }

        Iterator<Integer> iobj2 = iobj.iterator();


        while(iobj2.hasNext())
        {
            System.out.print(iobj2.next()+" ");
        }


    }



}
