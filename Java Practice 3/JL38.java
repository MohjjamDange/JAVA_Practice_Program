import java.lang.*;
import javax.swing.*;
import java.awt.event.*;

class JL38
{
    public static void main(String a[])
    {
        Calculator cobj = new Calculator(400,400,"Calculator");
    }

}

class Calculator extends WindowAdapter implements ActionListener
{
    public JFrame mainframe;
    public JButton b1,b2,b3,b4,b5;
    public JTextField t1,t2;
    public JLabel lobj;
    Integer iNo1, iNo2;


    public Calculator(int hight, int width, String str)
    {
       mainframe = new JFrame(str);
        mainframe.setSize(hight,width);

        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("multi");
        b4 = new JButton("Div");
        b5 = new JButton("Clear");

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);
        mainframe.add(b5);

        t1 = new JTextField();
        t2 = new JTextField();

        mainframe.add(t1);
        mainframe.add(t2);

        lobj = new JLabel();
        mainframe.add(lobj);

        b1.setBounds(10,280,80,40);  
        b2.setBounds(100,280,80,40);
        b3.setBounds(190,280,80,40);
        b4.setBounds(290,280,80,40);
        b5.setBounds(10,220,80,40);

        t1.setBounds(50,150,70,30);
        t2.setBounds(250,150,70,30);

        lobj.setBounds(140,100,150,30);

        mainframe.addWindowListener(this);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        mainframe.setLayout(null);
        mainframe.setVisible(true);
    }

    public void windowClosing(WindowEvent obj)
    {
        System.out.println("Window Closing...");
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj)
    {
        Integer iNo1 = Integer.parseInt(t1.getText());
        Integer iNo2 = Integer.parseInt(t2.getText());

        if(obj.getSource() == b1)
        {
            lobj.setText("Addintion is :"+(iNo1 + iNo2));
        }
        else if(obj.getSource() == b2)
        {
            lobj.setText("Substraction is :"+(iNo1 - iNo2));
        }
        else if(obj.getSource() == b3)
        {
            lobj.setText("Multiplicatin is :"+(iNo1 * iNo2));
        }
        else if(obj.getSource() == b4)
        {
            lobj.setText("Dividation is :"+(iNo1 / iNo2));
        }
        else if(obj.getSource() == b5)
        {
            lobj.setText("Enter the Number");
            t1.setText(""+(iNo1 = 0));
            t2.setText(""+(iNo2 = 0));
        }
    }
}

