import java.lang.*;

class AP69
{

    public static void main(String a[])
    {
        Demo dobj = new Demo();
        dobj.fun();

       Demo.gun();
       System.out.println(Demo.k);
     
    }
}                                       

class Demo
{
    public int i;
    public int j;
    public static int k;

    public Demo()
    {
        System.out.println("inside of Defaut Constructer");
        this.i = 15;
        this.j = 20;
       
    }
    static
    {
        k = 10;
    }

    public void fun()
    {
        System.out.println("Inside of Non Static method");
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(this.k);

        
    }

    public static void gun()
    {
        System.out.println("Inside of static gun method");
        System.out.println(k);
    }

}

