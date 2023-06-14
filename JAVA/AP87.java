import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class AP87
{
    public static void main(String a[])
    {
        Hello hobj = new Hello("Information");
    }

}

class Hello
{
   
    public Hello(String str)
    {
        Frame fobj = new Frame(str);
        fobj.setSize(500,500);
        Button b1 = new Button("ClickMe");
        fobj.add(b1);
        b1.setBounds(115,150,50,30);

        Label lobj = new Label("Enter Your Car Name");
        fobj.add(lobj);
        lobj.setBounds(10,150,100,40);

        TextField tf = new TextField();
        fobj.add(tf);
        tf.setBounds(10,180,50,30);


       
        fobj.setLayout(null);
        fobj.setVisible(true);

       
        
    }


}


