import java.lang.*;
import java.util.*;

class JL155
{
    public static void main(String a[])
    {
        Stack<Integer> sobj = new Stack<Integer>();

        sobj.push(11);
        sobj.push(21);
        sobj.push(33);
        sobj.push(44);
        sobj.push(45);
        sobj.push(55);

        System.out.println(sobj);

        sobj.pop();
        System.out.println(sobj);

        if(sobj.empty())
        {
            System.out.println("Stack Contain No any elements");
        }
        else
        {
            System.out.println("Static is Contain the Element");
        }

        int iPos = sobj.search(45); // this method is Denot from top of position
        if(iPos < 0)
        {
            System.out.println("Such Element not in Stack");
        }
        else
        {
            System.out.println("Elements is position from top is :"+iPos);

        }

        ListIterator lobj = sobj.listIterator();

        while(lobj.hasNext())
        {
            System.out.println(lobj.next());
        }

        System.out.println("DisPlay Revers Order");

        while(lobj.hasPrevious())
        {
            System.out.println(lobj.previous());
        }

         Integer iEl = sobj.peek();
        System.out.println("Peek element is :"+iEl);

        


    }

}