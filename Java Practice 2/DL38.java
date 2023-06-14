import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


class NL30
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Vehical Makers Name :");
        String fname = sobj.nextLine();

        AwtProgram aobj = new AwtProgram(fname);
        

    }
}

class AwtProgram
{
    public AwtProgram(String str)
    {
        Frame f = new Frame(str);
        Button btn = new Button("Set");
        Label lobj = new Label("Enter the Vehical Name :");
        TextField tobj = new TextField("Write");
        Label lobj2 = new Label("Enter the Fuel type : ");
        Checkbox cobj = new Checkbox("Diesel",true);
        Checkbox cobj2 = new Checkbox("Petrol",true);
        Checkbox cobj3 = new Checkbox("CNG",true);
        Choice ch = new Choice();
        f.add(ch);
        ch.add("sedan");
        ch.add("Hatchback");
        ch.add("SUV");
        ch.add("Other");

        ch.setBounds(10,160,80,30);


        f.add(cobj);
        cobj.setBounds(10,110,50,30);
        f.add(cobj2);
        cobj2.setBounds(10,140,50,30);
        f.add(cobj3);
        cobj3.setBounds(10,180,50,30);
        f.add(tobj);
        tobj.setBounds(170,60,100,30);
        
        f.add(lobj);
        lobj.setBounds(10,60,150,30);
        f.add(lobj2);
        lobj2.setBounds(10,90,150,30);
        f.add(btn);
        btn.setBounds(270,60,100,30);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new VehicalListener());

    }
}

class VehicalListener implements WindowListener
{
    public void windowActivated(WindowEvent obj){}
    public void windowDeactivated(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}
    public void windowOpened(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}
    public void windowClosing(WindowEvent obj)
    {
        System.out.println("Window is Closing");
        System.exit(0);
    }
}