import java.lang.*;

class Demo
{
    public int fun(int iNo1, int iNo2)
    {
       int iAns = 0;
       iAns = iNo1 + iNo2;
       return iAns;
    }

    public int fun(int iNo1, int iNo2, int iNo3)
    {
       int iAns = 0;
       iAns = iNo1 + iNo2+ iNo3;
       return iAns;
    }

    public int fun(int iNo1, int iNo2, int iNo3, int iNo4)
    {
       int iAns = 0;
       iAns = iNo1 + iNo2+ iNo3+ iNo4;
       return iAns;
    }

}

class DL7
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo();
        int iRet = 0;

       iRet = dobj.fun(11,12); 
        System.out.println("Addintion is"+iRet);

        iRet = dobj.fun(11,12,13); 
        System.out.println("Addintion is"+iRet);

        iRet = dobj.fun(11,12,13,14); 
        System.out.println("Addintion is"+iRet);


    }
}