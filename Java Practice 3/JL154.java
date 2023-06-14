import java.lang.*;


class JL154
{
    public static void main(String a[])
    {
        Demo<Integer> iobj = new Demo<>(15);

        Demo<String> sobj = new Demo<>("Hello");


        int iRet = iobj.Display();
        System.out.println("Number is :"+iRet);
        String str = sobj.Display();
        System.out.println("Number is :"+str);
    }

}

class Demo<T>
{
    public T data;
    public Demo(T a)
    {
        data = a;
    }

     public T Display()
     {
        return data;
     }   

}