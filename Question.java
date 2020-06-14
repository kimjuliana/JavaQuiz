import java.awt.*;
import javax.swing.*;

//abstract class Question
public abstract class Question {
	// Adding variables and methods from the "MultipleChoiceQuestion"
	QuestionDialog question;
	String correctAnswer;

	static int nQuestions = 0;
	static int nCorrect = 0;

	Question(String question) {
		//constructor that initializes instance variable "question", 
		//gives it a single-column grid layout, and adds a text label using the constructor's String parameter
		this.question = new QuestionDialog(); 
		this.question.setLayout(new GridLayout(0,1)); 
		this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));
	}
	void initQuestionDialog() {
		//method that makes instance variable "question" modal, 
		//sets its size with "pack", and positions it in the center of the screen
		this.question.setModal(true);
		this.question.pack(); 
		this.question.setLocationRelativeTo(null);
	}

	//abstract method "ask"
	String ask() {
		//method "ask" that makes the instance variable "question" visible 
		//and returns the value "question.answer"
		question.setVisible(true);
		return question.answer;
	}

	// instance method "check"
	void check() {
		nQuestions++;
		String answer = ask();
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is: " + correctAnswer);
		}

	}

	// class method "showResults"
	static void showResults() {

		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");

	}
}