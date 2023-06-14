import java.lang.*;
import java.awt.*;

class DL34
{
    public static void main(String arg[])
    {
        GlobleMoter gobj = new GlobleMoter("Globle Moter");
    }

}

class GlobleMoter
{
    public GlobleMoter(String str)
    {
        Frame f = new Frame(str);
       

        TextField t = new TextField();        
        
        Button b = new Button("Click");
        f.add(b);
        f.add(t);
        t.setBounds(10, 100, 50, 30);
	    b.setBounds(100, 100, 80, 40);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    
    }

}