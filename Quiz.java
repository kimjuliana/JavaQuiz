public class Quiz {

	//main method
	public static void main(String[] args) {	

		//True or False Questions
		Question question = new TrueFalseQuestion(
				"Is the capital city of Australia Sydney?", "False"); 
		//use the "check" method with both "MultipleChoiceQuestion" and "TrueFalseQuestion" objects
		question.check();

		question = new TrueFalseQuestion(
				"Is blue whale the biggest animal on Earth?", "True"); 
		question.check();

		question = new TrueFalseQuestion(
				"Is purple produced by combining blue and red?", "True"); 
		question.check();

		question = new TrueFalseQuestion(
				"Is Euro the currency for Poland", "False"); 
		question.check();

		question = new TrueFalseQuestion(
				"Is Russia the coldest country in the world", "True"); 
		question.check();


		//Multiple Choice Questions
		question = new MultipleChoiceQuestion(
				"Which Country has most airports?",
				" Mexico",
				" United States",
				" Canada",
				" Brazil",
				" Russia",
				"b");
		question.check();
		// use the "check" method with both "MultipleChoiceQuestion" and "TrueFalseQuestion" objects

		question  = new MultipleChoiceQuestion(
				"What is the most spoken language in the world?",
				"Arabic",
				"Spanish",
				"English",
				"Mandarin",
				"Bengali",
				"d");
		question.check();


		question = new MultipleChoiceQuestion(
				"What is the longest-running TV show of all time?",
				"Dallas",
				"Law & Order",
				"Grey's Anatomy",
				"Lassie",
				"The Simpsons",
				"e");
		question.check();

		question = new MultipleChoiceQuestion(
				"What is the best-selling book of all time?",
				"The Lord of The Rings",
				"The Little Prince",
				"Don Quixote",
				"Xinhua Zidian",
				"A Tale of Two Cities",
				"c");
		question.check();

		question = new MultipleChoiceQuestion(
				"Who are the richest people in the world?",
				"Jeff Bezos",
				"Bill Gates",
				"Michael Bloomberg",
				"Mark Zuckerberg",
				"Bernard Arnault",
				"a");
		question.check();
		MultipleChoiceQuestion.showResults();
		//report correct results using the "showResults" method from class "Question"


	}
}
