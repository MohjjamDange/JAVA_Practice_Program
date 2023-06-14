import java.lang.*;

class AP75
{
    public static void main(String a[])
    {
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(111);
        sobj.InsertFirst(81);
        sobj.InsertFirst(51);
        sobj.InsertLast(21);
        sobj.InsertLast(11);

        

        sobj.InsertAtPos(25,3);
        sobj.DeleteAtPos(3);

        sobj.DeleteFirst();
        sobj.DeleteLast();

        sobj.Display();

        int iRet = sobj.Count();
        System.out.println("\n Total Number of Node is :"+iRet);




    }

}

class Node
{
    public int Data;
    public Node Next;

    public Node(int iNo)
    {
        this.Data = iNo;
        this.Next = null;
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
      

        if(this.Head == null)
        {
            this.Head = newn; 
        }
        else
        {
            newn.Next = this.Head;
            this.Head = newn;

        }
        iCount++;


    }

    public void InsertLast(int iNo)
    {
        Node newn = new Node(iNo);
       

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

    public void InsertAtPos(int iNo, int iPos)
    {
        

        if((iPos < 1) || (iPos > iCount+1))
        {
            System.out.println("Please Enter the Valied Position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iNo);
        }else if(iPos == iCount+1)
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

            newn.Next = temp.Next;           
            temp.Next = newn;
            iCount++;
        }

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
        else if(iPos ==iCount)
        {
            DeleteLast();
        }
        else
        {
            Node temp = Head;
            for(int iCnt = 1; iCnt < iPos-1; iCnt++)
            {
                temp = temp.Next;

            }

            temp.Next = temp.Next.Next;


        }

        iCount--;     
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
            iCount--;

        }

    }

    public void Display()
    {
        Node temp = Head;
        while(temp != null)
        {
            System.out.print(temp.Data+"->");
            temp = temp.Next;
        }
        System.out.print(" NULL");
    }

    public int Count()
    {
        return iCount;
    }



}

