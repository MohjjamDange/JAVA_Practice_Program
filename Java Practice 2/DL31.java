import java.lang.*;

class Demo
{
    public int Arr[];

    public Demo(int iSize)
    {
        this.Arr = new int[iSize];
    }

    protected void finalize()
    {
        System.out.println("Inside of Finalize method");
        this.Arr = null;
    }


}

class DL31
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo(10);
        System.gc();
        dobj = null;
        
        System.out.println("End of Main");
    }

}