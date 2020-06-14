import java.awt.*;
import javax.swing.*;

// class "MultipleChoiceQuestion" as a subclass of "Question
public class MultipleChoiceQuestion extends Question {


	//Constructor
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		super(query);	
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		initQuestionDialog();

		correctAnswer = answer.toUpperCase();

	}
	void addChoice(String name, String label) {
		//method that creates a panel with a border layout, creates a button using its first String parameter, 
		//adds the instance variable "question" as a listener for that button, 
		//adds the button to the left side of the panel, adds a label to the center of the panel using its second String parameter,
		//and adds the panel to the instance variable "question"?
		JPanel choice = new JPanel(new BorderLayout());
		JButton button = new JButton(name);
		button.addActionListener(question);
		choice.add(button,BorderLayout.WEST);
		choice.add(new JLabel(label+"				",JLabel.LEFT),BorderLayout.CENTER);
		question.add(choice);
	}

}


