import java.lang.*;

class DL15
{
    public static void main(String arg[])
    {
        int Arr[][] = new int[2][3];

        Arr[0][0] = 10;
        Arr[0][1] = 20;
        Arr[0][2] = 30;
        Arr[1][0] = 40;
        Arr[1][1] = 50;
        Arr[1][2] = 60;

        System.out.println("Array is :");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.println(Arr[i][j]);
            }
        }
    }
}