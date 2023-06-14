import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class DL36
{
    public static void main(String a[])
    {
        AwtProgram aobj = new AwtProgram("Globle Moters");

    }
}

class AwtProgram
{
    public Frame f;
    public AwtProgram(String str)
    {
        f = new Frame(str);
        f.setSize(600, 600);
        Button b = new Button("Click Me");
        f.add(b);
        b.setBounds(100, 300,80,30);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new DemoListener());

    }


}

class DemoListener implements WindowListener
{
    public void windowActivated(WindowEvent obj){}
    public void windowDeactivated(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void windowClosed(WindowEvent obj){}
    public void windowOpened(WindowEvent obj){}

}
