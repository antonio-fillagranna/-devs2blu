public class Student {

	private Integer callNumber = 0;
	private String name = "";

	Student() {
		this.setName("");
		this.setCallNumber(0);
	}

	Student(Integer callNumber, String name) {
		this.setCallNumber(callNumber);
		this.setName(name);
	}

	public Integer getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(Integer callNumber) {
		this.callNumber = callNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		String msg = "Número chamada : %s - Nome Aluno : %s \n";

		String msgFinal = String.format(msg, this.getCallNumber(), this.getName());

		return msgFinal;
	}

}
