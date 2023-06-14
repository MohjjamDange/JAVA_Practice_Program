import java.lang.*;

class AP5
{
    public static void main(String a[])
    {
        Hello hobj = new Hello();
                
        hobj.gun();
        hobj.run();       

    }

}


interface Demo
{
    int x = 10; // public ,static , final.
    int y = 12; // public ,static, final.
    void run(); // public, abstract.
    void gun(); // public , abstract.
}

class Hello implements Demo
{
    public void gun()
    {
        System.out.println("Inside Hello gun");
    }

    public void run()
    {
        System.out.println("Inside of Hello run");
    }
}

