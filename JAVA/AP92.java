import java.lang.*;

class AP92
{
    public static void main(String a[])
    {
        Demo dobj = new Demo();

        System.out.println("After Demo Constructer");

        Demo.Hello hobj = dobj.new Hello();

        

        hobj.hobj2.fun2(); 
        
    }

}

class Demo
{
    public Demo()
    {
        System.out.println("Demo Constructer");
    }
    class Hello
    {
        public Hello()
        {
            System.out.println("Hello Constructer");
        }
        Hello2 hobj2 = new Hello2();


        class Hello2
        {
            public void fun2()
            {
                System.out.println("Inside of fun2");

            }

        }


        public void fun()
        {
            System.out.println("Inside of fun");
        }


    }
}


