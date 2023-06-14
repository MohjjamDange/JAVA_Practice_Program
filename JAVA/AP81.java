import java.lang.*;

class AP81
{
    public static void main(String a[])
    {
        SinglyCL sobj = new SinglyCL();

        sobj.InsertFirst(111);
        sobj.InsertFirst(81);
        sobj.InsertFirst(51);
        sobj.InsertLast(151);
        sobj.InsertLast(161);
        
        //sobj.DeleteFirst();
       // sobj.DeleteLast();

        sobj.InsertAtPos(25,3);
        sobj.DeleteAtPos(3);

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


class SinglyCL
{
    public int iCount;
    public Node Head;
    public Node Tail;

    public SinglyCL()
    {
        this.Head = null;
        this.Tail = null;
        this.iCount = 0;

    }

    public int Count()
    {
        return  iCount;
    } 

    public void DeleteFirst()
    {
        if((Head == null)&& (Tail == null))
        {
            return;
        }
        else
        {
            Head = Head.Next;
            Tail.Next = Head;
        }
        iCount--;



    }

    public void InsertAtPos(int iNo, int iPos)
    {
        if((iPos < 1)&&(iPos > iCount+1))
        {
            System.out.println("Invalied Position");
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
            Node Temp = Head;

            for(int iCnt = 1; iCnt < iPos-1; iCnt++)
            {
                Temp = Temp.Next;

            }

            newn.Next = Temp.Next;
            Temp.Next = newn;



        }

        iCount++;




    }

    public void DeleteAtPos(int iPos)
    {
        if((iPos< 1)&&(iPos> iCount+1))
        {
            System.out.println("Enter Valied Position");
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
            for(int iCnt = 1; iCnt < iPos - 1; iCnt++)
            {
                temp = temp.Next;

            }

            temp.Next = temp.Next.Next;


        }

        iCount--;


    }

    public void DeleteLast()
    {

        if((Head == null)&&(Tail == null))
        {
            return;
        }
        else
        {
            Node temp = Head;

            while(temp.Next != Tail)
            {
                temp = temp.Next;
            }

            temp.Next = Head;

        }

        iCount--;



    }

    public void Display()
    {
        Node temp = Head;

       do
       {

        System.out.print(temp.Data+"->");
        temp = temp.Next;
       }while(temp != Head);

    }

    public void InsertLast(int iNo)
    {
        Node newn = new Node(iNo);

        if((Head == null)&&(Tail == null))
        {
            Head = newn;
            Tail = newn;
            newn.Next = Head;
        }
        else
        {
            Tail.Next = newn;
            newn.Next = Head;
            Tail = newn;



        }

        iCount++;

    }

    public void InsertFirst(int iNo)
    {
        Node newn = new Node(iNo);

        if((Head == null) &&(Tail == null))
        {
            Head = newn;
            Tail = newn;
            newn.Next = Head;
        }
        else
        {
            newn.Next = Head;
            Tail.Next = newn;
            Head = newn;
            
        }

        iCount++;


    }




}

