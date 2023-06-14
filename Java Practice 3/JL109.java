import java.lang.*;
import java.util.*;

class JL109
{
    public static void main(String a[])
    {
        Stack<Integer> sobj = new Stack<Integer>();

        sobj.push(10);
        sobj.push(20);
        sobj.push(30);
        sobj.push(40);
        sobj.push(50);
        sobj.push(60);
        System.out.println("Stack is :"+sobj);

        sobj.pop();
        System.out.println("Stack is :"+sobj);
       

        int iPos = sobj.search(40);
        if(iPos == -1)
        {
            System.out.println("There is No Such Element");
        }
        System.out.println("Position is :"+iPos);

        boolean bRet = sobj.empty();
        if(bRet == true)
        {
            System.out.println("Stack hava Not Containt Element");
        } 
        else
        {
           
             System.out.println("Stack Containt Element\n");
        }
                /*
        Iterator<Integer> iobj = sobj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        System.out.println("Size is :"+sobj.size());

        System.out.println("ListIterator by :"); */

      ListIterator<Integer> lobj = sobj.listIterator();
      while(lobj.hasPrevious())
      {
        System.out.println(lobj.previous());
      }



    }
}