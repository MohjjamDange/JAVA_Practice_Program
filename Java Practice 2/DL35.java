import java.lang.*;
import java.awt.*;

class PL59
{
	public static void main(String arg[])
	{
		AwtProgram aobj = new AwtProgram();

	}
}

class AwtProgram
{
	public AwtProgram()
	{
		Frame f = new Frame();
		Button b = new Button("Home");
		TextField t = new TextField();
		
		f.add(t);
		t.setBounds(10, 100, 50, 30);
		

		f.add(b);
		b.setBounds(100, 100, 80, 40);
		
		
		f.setSize(400,400);
		f.setTitle("Hello");
		f.setLayout(null);
		f.setVisible(true);
	}

}
