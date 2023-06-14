import java.lang.*;

class AP78
{
    public static void main(String a[])
    {
        DubllyLL dobj = new DubllyLL();

        dobj.InsertFirst(101);
        dobj.InsertFirst(81);
        dobj.InsertFirst(51);
        
        dobj.InsertLast(111);
        dobj.InsertLast(151);

        dobj.DeleteFirst();
        dobj.DeleteLast();

        dobj.InsertAtPos(25,3);
        dobj.DeleteAtPos(3);

        dobj.Display();



        int iRet = dobj.Count();
        System.out.println("\nTotal Nmber of Count is :"+iRet);

    }
}

class Node
{
    public int Data;
    public Node Prev;
    public Node Next;

    public Node(int iNo)
    {
        this.Data = iNo;
        this.Prev = null;
        this.Next = null;
        
    }

}


class DubllyLL
{

    public int iCount;
    public Node Head;
    public Node Tail;

    public DubllyLL()
    {
        this.Head = null;
        this.Tail = null;
        this.iCount = 0;

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
            Head.Prev = null;
        }

        iCount--;
    }

    public void DeleteLast()
    {
        if((Head == null)||(Tail == null))
        {
            return;
        }
        else
        {
            Tail = Tail.Prev;
            Tail.Next = null;
        }

        iCount--;
    }

    public void InsertFirst(int iNo)
    {
        Node newn = new Node(iNo);

        if((Head == null)&&(Tail == null))
        {
            Head = newn;
            Tail = newn;
        }
        else
        {
            Head.Prev = newn;
            newn.Next = Head;
            Head = newn;
        }

        iCount++;


    }

    public void Display()
    {
        Node temp = Head;

        while(temp != null)
        {
            System.out.print(temp.Data+"< - >");
            temp = temp.Next;
        }

        System.out.print(" NULL");



    }

    public void DeleteAtPos(int iPos)
    {
        if((iPos < 1)||(iPos > iCount+1))
        {
            System.out.println("Enter the Valied Position");
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

            for(int iCnt = 1; iCnt < iPos; iCnt++)
            {
                temp = temp.Next;

            }

            temp.Next.Prev =  temp.Prev;
            temp.Prev.Next = temp.Next;
        }

        iCount--;



    }

    public void InsertAtPos(int iNo, int iPos)
    {
        if((iPos < 1)||(iPos > iCount+1))
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
            Node newn = new Node(iNo);
            Node temp = Head;
            for(int iCnt = 1; iCnt < iPos-1; iCnt++)
            {
                temp = temp.Next;
            }

            temp.Next.Prev = newn;
            newn.Next = temp.Next;
            newn.Prev = temp;
            temp.Next = newn;
        }

        iCount++;




    }

    public int Count()
    {
        return iCount;
    }

    public void InsertLast(int iNo)
    {
        Node newn = new Node(iNo);
        if((Head == null)&&(Tail == null))
        {
            Head = newn;
            Tail = newn;
        }
        else
        {
            newn.Prev = Tail;
            Tail.Next = newn;
            Tail = newn;
        }

        iCount++;


    }



}



