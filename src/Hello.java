import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello 
{
	public static void main(String[] args)
	{
		MyFrame myframe = new MyFrame("Hello World");
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);

	}

}
