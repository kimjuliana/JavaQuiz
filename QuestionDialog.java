import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener {
	//extending "JDialog" and implementing "ActionListener"

	String answer;
	public void actionPerformed(ActionEvent e) {
		//method that uses its "ActionEvent" parameter 
		//to set the instance variable "answer" and then calls the inherited "dispose" method
		answer = e.getActionCommand();
		dispose();
	}
}
