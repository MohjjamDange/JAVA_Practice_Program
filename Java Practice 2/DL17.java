import java.lang.*;

class DL17
{
    public static void main(String arg[])
    {
        int Arr[][] = new int[3][];

        Arr[0] = new int[3];
        Arr[1] = new int[5];
        Arr[2] = new int[4];

        Arr[0][0] = 10;
        Arr[0][1] = 20;
        Arr[0][2] = 30;
        Arr[1][0] = 40;
        Arr[1][1] = 50;
        Arr[1][2] = 60;
        Arr[1][3] = 70;
        Arr[1][4] = 80;
        Arr[2][0] = 90;
        Arr[2][1] = 11;
        Arr[2][2] = 22;
        Arr[2][3] = 33;


        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}