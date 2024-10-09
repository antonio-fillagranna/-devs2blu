public class TestAnswer {

	private Double right = 0.0;
	private Double wrong = 0.0;
	private Double score = 0.0;
	private Test test = new Test();
	private Question[] listQuestions = {};
	private String[] listAnswers = {};
	private Student student = new Student();

	TestAnswer() {
		this.setListAnwers(new String[1]);
		this.setListQuestions(new Question[1]);
		this.setStudent(new Student());
		this.setTest(new Test());
		
		this.setRight(0.0);
		this.setWrong(0.0);
		this.setScore(0.0);
	}

	TestAnswer(Test test, Student student, String[] listAwsners) {
		this();
		
		this.test = test;
		this.student = student;
		this.listAnswers = listAwsners;
	}

	public Double getRight() {
		return right;
	}

	public void setRight(Double right) {
		this.right = right;
	}

	public Double getWrong() {
		return wrong;
	}

	public void setWrong(Double wrong) {
		this.wrong = wrong;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Question[] getListQuestions() {
		return listQuestions;
	}

	public void setListQuestions(Question[] listQuestions) {
		this.listQuestions = listQuestions;
	}

	public String[] getListAnswers() {
		return listAnswers;
	}

	public void setListAnwers(String[] listAnswers) {
		this.listAnswers = listAnswers;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void gradeTest() {

		this.setListQuestions( this.getTest().getRandomTest() );

		Integer numberQuestions = this.listQuestions.length;

		for (var i = 0; i < this.listQuestions.length; i++) {
			if (listQuestions[i].getAnswer().equals(this.getListAnswers()[i])) {
				right++;
			} else {
				wrong++;
			}
		}

		this.score = (this.getRight() / numberQuestions) * 10;

		if (this.score >= 7) {
			System.out.printf("PROVA : %s - ALUNO : %s - DISCIPLINA : %s - APROVADO - SUA NOTA É %.2f \n",
					this.test.getTest(), this.student.getName(), this.getTest().discipline(), getScore());
		}

		if (this.score < 7) {
			System.out.printf("PROVA : %s - ALUNO : %s - DISCIPLINA : %s -    EXAME - SUA NOTA É %.2f \n",
					this.test.getTest(), this.student.getName(), this.getTest().discipline(), this.getScore());
		}

	}

	@Override
	public String toString() {
		return this.getListAnswers().toString();
	}

}
