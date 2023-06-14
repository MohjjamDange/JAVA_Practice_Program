import java.lang.*;

class JL159
{
    public static void main(String a[])
    {
        SingllyLL sobj = new SingllyLL();

        sobj.InsertFirst(111);
        sobj.InsertFirst(81);
        sobj.InsertFirst(61);
        sobj.InsertFirst(31);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(121);
        sobj.InsertLast(131);
         sobj.Display();

       // sobj.DeleteFirst();
       // sobj.DeleteLast();

        sobj.InsertAtPos(44,4);
        sobj.DeleteAtPos(5);

        sobj.Display();

        int iRet = sobj.Count();
        System.out.println("Total Count of Node:"+iRet);




    }

}

class Node
{
    public int Data;
    public Node Next;
    public Node(int iNo)
    {
        Data = iNo;
        Next = null; 

    }

}


class SingllyLL
{
    public Node Head;
    public int iCount;

    public SingllyLL()
    {
        Head = null;
        iCount = 0;
      
    }

    public void InsertFirst(int iNo)
    {
        Node newn = new Node(iNo);

        newn.Next = null;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            newn.Next = Head;
            Head = newn;

        }
        iCount++;
    }

    public void InsertLast(int iNo)
    {
        Node newn = new Node(iNo);
        newn.Next = null;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            Node temp = Head;

            while(temp.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = newn;

        }
        iCount++;

    }

    public void Display()
    {
        Node temp = Head;
        System.out.println("LinkList is :");

        do
        {
            System.out.print(temp.Data+"->");
            temp = temp.Next;


        }while(temp != null);

        System.out.println("");


    }

    public int Count()
    {
        return iCount;
    }

    public void DeleteFirst()
    {
        if(Head == null)
        {
            return;
        }
        else
        {
            Head = Head.Next;
        }

        iCount--;
    }

    public void DeleteLast()
    {
        if(Head == null)
        {
            return;
        }
        else
        {
            Node temp = Head;
            while(temp.Next.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = null;
        }
        iCount--;
        
    }

    public void DeleteAtPos(int iPos)
    {
        if((iPos < 0)||(iPos > iCount+1))
        {
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount+1)
        {
            DeleteLast();
        }
        else
        {
            Node temp = Head; 
            for(int iCnt = 1; iCnt < iPos-1;iCnt++)
            {
                temp = temp.Next;
            }
            temp.Next = temp.Next.Next;

        }
        iCount--;
    }

    public void InsertAtPos(int iNo, int iPos)
    {
        Node newn = new Node(iNo);
        newn.Next = null;

        if((iPos < 0)||(iPos > iCount+1))
        {
            System.out.println("Enter the Valied Position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(iNo);
        }
        else
        {
            Node temp = Head;
            for(int iCnt = 1; iCnt < iPos-1;iCnt++)
            {
                temp = temp.Next;

            }
            newn.Next = temp.Next;
            temp.Next = newn;

        }
        iCount++;
    }

}


