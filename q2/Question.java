public class Question {

	private Integer numberQuestion;
	private String description;
	private String answer;
	private Subject subject;
	private Integer quarter;

	Question() {
		this.setNumberQuestion(0);
		this.setDescription("");
		this.setAnswer("");
		this.setSubject(new Subject());
		this.setQuarter(0);		
	}

	Question(Integer numeroQuestion, String description, String answer, Subject subject, Integer quarter) {
		this.setNumberQuestion(numberQuestion);
		this.setDescription(description);
		this.setAnswer(answer);
		this.setSubject(subject);
		this.setQuarter(quarter);
	}

	public Integer getNumberQuestion() {
		return numberQuestion;
	}

	public void setNumberQuestion(Integer numberQuestion) {
		this.numberQuestion = numberQuestion;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Integer getQuarter() {
		return quarter;
	}

	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}

	@Override
	public String toString() {

		String msg = "%s - Bimestre: %s - Questão %s: %s - Resp.: %s \n";

		String msgFinal = String.format(msg, this.getSubject(), this.getQuarter(), this.getNumberQuestion(), this.getDescription(), this.getAnswer());

		return msgFinal;
	}

}
