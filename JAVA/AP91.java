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

class Demo extends WindowAdapter implements ActionListener
{
    public Button bt1;
    public TextField  tf;
    public Demo(String str)
    {
        Frame fobj = new Frame(str);
        fobj.setSize(500,500);

        bt1 = new Button("Click");
        fobj.add(bt1);
        bt1.setBounds(350,100,50,30);

        Label lobj = new Label("Enter The Vehical Name ");
        fobj.add(lobj);
        lobj.setBounds(10,100,150,20);

        tf = new TextField();
        fobj.add(tf);
        tf.setBounds(170,100,230,30);

        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.addWindowListener(this);
        bt1.addActionListener(this);
      
    }

    public void wiondowClosing(WindowEvent obj)
    {
        System.out.println("Window Closing");
        System.exit(0);
    }

    public void actionPerformed(ActionEvent aobj)
    {
       String str = "Enter Your Vehical Number";

        if(aobj.getSource() == bt1)
        {
          
          
            tf.setText(""+str);
        }
    }




}