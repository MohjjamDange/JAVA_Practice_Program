import java.lang.*;
import java.awt.*;

class DL33
{
    public static void main(String a[])
    {
        AwtProgram aobj = new AwtProgram();



    }
}

class AwtProgram
{
    public AwtProgram()
    {
        Frame f = new Frame("Globle Moters");
        Button btn = new Button("Click Me");
        btn.setBounds(100,200,60,30);
        f.add(btn);
        f.setSize(400,400);
       
        f.setLayout(null);   
        f.setVisible(true);     

    }


}