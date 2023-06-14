import java.lang.*;



class JL20
{
    public static void main(String a[])
    {
        String str = "HelloWorld";
        
        char Arr[] = str.toCharArray();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]);
        }
    }
    
}