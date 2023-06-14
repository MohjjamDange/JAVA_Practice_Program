import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class AP89
{
    public static void main(String a[])
    {
        Demo dobj = new Demo("Vehical Details"); 
    }



}

class Demo
{
    public Demo(String str)
    {
        Frame fobj = new Frame(str);
        fobj.setSize(500,500);

        Button bt1 = new Button("Click");
        fobj.add(bt1);
        bt1.setBounds(350,100,50,30);

        Label lobj = new Label("Enter The Vehical Name ");
        fobj.add(lobj);
        lobj.setBounds(10,100,150,20);

        TextField tf = new TextField();
        fobj.add(tf);
        tf.setBounds(170,100,230,30);

        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.addWindowListener(new VehicalListner());

    }


}

class VehicalListner implements WindowListener
{
    public void windowActivated(WindowEvent obj){}
    public void windowDeactivated(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}
    public void windowClosing(WindowEvent obj)
    {
        System.out.println("Window Closing");
    }
    public void windowOpened(WindowEvent obj){}
    public void windowClosed(WindowEvent obj)
    {}




}

