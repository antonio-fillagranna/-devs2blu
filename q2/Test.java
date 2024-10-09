public class Test {

	private String test = "A";
	private Integer grade;
	private Integer year;
	private Integer quarter;
	private Discipline discipline;
	private Question[] randomTest;
	private String[] testAnswers;

	Test() {					
		this.setDiscipline(new Discipline());
		this.setRandomTest(new Question[1]);
		this.setTestAnswer(new String[1]);
		
		this.setTest("A");
		this.setGrade(0);
		this.setYear(0);
		this.setQuarter(0);			
	}

	Test(String test, Integer grade, Integer year, Integer quarter, Discipline discipline) {
		this();
		
		this.setTest(test);
		this.setGrade(grade);
		this.setYear(year);
		this.setQuarter(quarter);
		this.setDiscipline(discipline);		
		
		this.setRandomTest( createRandomTest(discipline) );
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getQuarter() {
		return quarter;
	}

	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}

	public Discipline discipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	public Question[] getRandomTest() {
		return randomTest;
	}

	public void setRandomTest(Question[] randomTest) {
		this.randomTest = randomTest;
	}

	public String[] getTestAnswer() {
		return testAnswers;
	}

	public void setTestAnswer(String[] testAnswer) {
		this.testAnswers = testAnswers;
	}

	public static boolean even(Integer number) {

		Boolean help = false;

		if (number >= 2) {
			help = number % 2 == 0;
		}

		return help;
	}

	public Question[] createRandomTest(Discipline discipline) {

		Question[] listaOriginal = discipline.getListQuestions();
		Question[] listaAleatoria = listaOriginal;

		Boolean firstpar = this.getTest().equals("A");

		Integer size = listaOriginal.length;

		Question[] listaPar = new Question[size];
		Question[] listaImpar = new Question[size];

		Integer cursorPar = 0;
		Integer cursorImpar = 0;
		Integer cursorAleatorio = 0;

		for (var i = 0; i < listaOriginal.length; i++) {
			if (even(i)) {
				listaPar[cursorPar++] = listaOriginal[i];
			} else {
				listaImpar[cursorImpar++] = listaOriginal[i];
			}
		}

		if (firstpar) {
			for (var i = 0; i < cursorPar; i++) {
				listaAleatoria[cursorAleatorio++] = listaPar[i];
			}
			for (var i = 0; i < cursorImpar; i++) {
				listaAleatoria[cursorAleatorio++] = listaImpar[i];
			}
		} else {
			for (var i = 0; i < cursorImpar; i++) {
				listaAleatoria[cursorAleatorio++] = listaImpar[i];
			}
			for (var i = 0; i < cursorPar; i++) {
				listaAleatoria[cursorAleatorio++] = listaPar[i];
			}
		}

		embaralharLista(listaAleatoria, cursorAleatorio);
		
		return listaAleatoria;
	}

	public void embaralharLista(Question[] lista, int tamanho) {
		Integer tamanhoCorrigido = (tamanho - 1);

		for (Integer posicaoAtual = tamanhoCorrigido; posicaoAtual > 0; posicaoAtual--) {

			Integer novoValorAleatorio = (int) (Math.random() * (posicaoAtual + 1));

			Question localTemporario = lista[posicaoAtual];

			lista[posicaoAtual] = lista[novoValorAleatorio];

			lista[novoValorAleatorio] = localTemporario;
		}

	}

	public static void showLista(Question[] listaQuestao, String texto) {

		for (Question item : listaQuestao) {
			System.out.printf("%s - %s . %s %s \n", texto, item.getNumberQuestion(), item.getDescription(),
					item.getTestAnswer());

		}

	}

	@Override
	public String toString() {
		String msg = "Ano : %s - Bimestre: %s - Série : %s - Prova : %s \n";

		String msgFinal = String.format(msg, this.getYear(), this.getQuarter(), this.getGrade() , this.getTest());

		return msgFinal;
	}
}