import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class AP31
{
    public static void main(String a[])
    {
        AWTProgram aobj = new AWTProgram("HEllo");


    }



}

class AWTProgram
{
    public Frame fobj;
    public AWTProgram(String str)
    {
        fobj = new Frame(str);
        fobj.setSize(400,400);
        fobj.setVisible(true);
       

        fobj.addWindowListener(new MarvellousListner());
    }


 
}

class MarvellousListner extends WindowAdapter
{
    public void windowClosing(WindowEvent obj);
    
        System.exit(0);
    }


}