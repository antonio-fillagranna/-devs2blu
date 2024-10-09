public class Subject {

	private String nameSubject = "";
	private Integer grade = 0;

	Subject() {
		this.setNameSubject("");
		this.setGrade(0);
	}

	Subject(String nameSubject) {
		this.nameSubject = nomeMateria;
		this.grade = 1;
	}

	Subject(String nameSubject, Integer grade) {
		this.nameSubject = nameSubject;
		this.grade = grade;
	}

	public String getNameSubject() {
		return nameSubject;
	}

	public void setNameSubject(String nameSubject) {
		this.na = nameSubject;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setSerie(Integer grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {

		String msg = "Matéria : %s - Série : %s \n";

		String msgFinal = String.format(msg, this.getNameSubject(), this.getGrade());

		return msgFinal;
	}

}
