import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Hello 
{
	public static void main(String[] args)
	{
		MyFrame myframe = new MyFrame("Hello World");
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        
        String answer = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + answer , "alert", JOptionPane.DEFAULT_OPTION);

	}

}
