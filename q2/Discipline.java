public class Discipline {

	private String discipline = "";
	private Question[] listQuestions = {};

	Discipline() {
		this.setDiscipline("");
		this.setListQuestions(new Question[1]);
	}

	Discipline(String discipline) {
		this();
		
		this.setDiscipline(discipline);
	}

	Discipline(String discipline, Question[] listQuestions) {
		this.setDiscipline(discipline);
		this.setListQuestions(listQuestions);
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public Question[] getListQuestions() {
		return listQuestions;
	}

	public void setListQuestions(Question[] listQuestions) {
		this.listQuestions = listQuestions;
	}

	@Override
	public String toString() {
		return this.getDiscipline();
	}

}
