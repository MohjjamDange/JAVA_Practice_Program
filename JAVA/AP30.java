import java.lang.*;
import java.awt.*;
import java.util.*;


class AP30
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Frame name :");
        String str = sobj.nextLine();

        AWTProgram aobj = new AWTProgram(str);
        
    }

}


class AWTProgram
{
    public AWTProgram(String str)
    {
        Frame f = new Frame(str);
        f.setSize(500,500);

        Button bt = new Button("Click_Me");
        f.add(bt);
        bt.setBounds(100,100,80,50);
        f.setLayout(null);
        f.setVisible(true);
    }


}