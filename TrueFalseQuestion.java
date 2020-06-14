import javax.swing.*;

// class "TrueFalseQuestion" as a subclass of "Question
public class TrueFalseQuestion extends Question {


	TrueFalseQuestion(String question, String answer) {	
		//constructor that calls its superclass constructor with its first String parameter, 
		//calls "addButton" to add "TRUE" and "FALSE" buttons to a panel, adds that panel to the instance variable "question", 
		//calls "initQuestionDialog", and initializes the instance variable "correctAnswer" with its second String parameter
		super(question);
		JPanel buttons = new JPanel();	
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		correctAnswer = answer.toUpperCase();		  
	}

	void addButton(JPanel buttons, String label) {
		//method that constructs a button using its String parameter, 
		//adds the instance variable "question" as a listener for that button, 
		//and adds the button to its "JPanel" parameter
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}


}
