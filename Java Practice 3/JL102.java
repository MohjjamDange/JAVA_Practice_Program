import java.lang.*;


class JL102
{
    public static void main(String a[])
    {
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(101);
        sobj.InsertFirst(81);
        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(151);
        sobj.InsertLast(161);

        sobj.DeleteFirst();
        sobj.DeleteLast();
        

        sobj.InsertAtPos(45,4);
        sobj.DeleteAtPos(4);

        sobj.Display();


    }


}

class Node
{
    public int Data;
    public Node next;

    public Node(int iNo)
    {
        this.Data = iNo;
        this.next = null;
    }
}


class SinglyLL
{
    public Node Head;
    public int iCount;

    public SinglyLL()
    {
        this.Head = null;
        this.iCount = 0;

    }

    public void InsertFirst(int iNo)
    {
        Node newn = new Node(iNo);

        newn.next = null;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            newn.next = Head;
            Head = newn;
        }
        iCount++;
    }

    public void InsertLast(int iNo)
    {
        Node newn = new Node(iNo);

        newn.next = null;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            Node temp = Head;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
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
        else if(iCount == 1)
        {
            Head = null;
        }
        else
        {
            Head = Head.next;
            
        }
        iCount--;

    }

    public void DeleteLast()
    {
        if(Head == null)
        {
            return;
        }
        else if(iCount == 1)
        {
            Head = null;
        }
        else
        {
            Node temp = Head;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;

        }
        
        iCount--;


    }

    public void Display()
    {
        Node temp = Head;

        System.out.println("Linklist is :");

        do
        {
            System.out.print(temp.Data+"->");
            temp = temp.next;
        }while(temp != null);
        System.out.println("null");       
    }

    public void InsertAtPos(int iNo, int iPos)
    {
        Node newn = new Node(iNo);

        newn.next = null;
        if((iPos < 1)||(iPos>iCount+1))
        {
            System.out.println("Invalied Position");
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
            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;
        }
        iCount++;
    }

    public void DeleteAtPos(int iPos)
    {
        if((iPos < 1)||(iPos > iCount+1))
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
                        
            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }


    }


}

