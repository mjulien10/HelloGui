import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello 
{
	public static void main(String[] args)
	{
		MyFrame myframe = new MyFrame("Hello World");
		JLabel jlabel = new JLabel("Hello World");
		JLabel jlabel2 = new JLabel("Hello Wolrd");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.getContentPane().add(jlabel);
        myframe.getContentPane().add(jlabel2);
        myframe.setVisible(true);

	}

}
