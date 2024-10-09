public class TestTest {
    public static void main(String[] args) {
        Subject math = new Subject("Addition", 1);

        Question question1Grade1 = new Question(1, "What is 3 + 1?", "4", math, 1);
        Question question2Grade1 = new Question(2, "What is 6 - 3?", "3", math, 1);
        Question question3Grade1 = new Question(3, "What is 4 * 4?", "16", math, 1);
        Question question4Grade1 = new Question(4, "What is 12 / 4?", "3", math, 1);
        Question question5Grade1 = new Question(5, "What is 9 - 5?", "4", math, 1);

        Question question1Grade2 = new Question(1, "What is 5 + 6?", "11", math, 2);
        Question question2Grade2 = new Question(2, "What is 7 + 7?", "14", math, 2);
        Question question3Grade2 = new Question(3, "What is 10 * 2?", "20", math, 2);
        Question question4Grade2 = new Question(4, "What is 18 / 3?", "6", math, 2);
        Question question5Grade2 = new Question(5, "What is 15 - 9?", "6", math, 2);

        Question question1Grade3 = new Question(1, "What is 6 * 6?", "36", math, 3);
        Question question2Grade3 = new Question(2, "What is 8 + 9?", "17", math, 3);
        Question question3Grade3 = new Question(3, "What is 20 / 4?", "5", math, 3);
        Question question4Grade3 = new Question(4, "What is 30 - 12?", "18", math, 3);
        Question question5Grade3 = new Question(5, "What is 5 * 8?", "40", math, 3);

        Question question1Grade4 = new Question(1, "What is 14 + 11?", "25", math, 4);
        Question question2Grade4 = new Question(2, "What is 24 / 4?", "6", math, 4);
        Question question3Grade4 = new Question(3, "What is 18 - 7?", "11", math, 4);
        Question question4Grade4 = new Question(4, "What is 9 * 6?", "54", math, 4);
        Question question5Grade4 = new Question(5, "What is 20 + 5?", "25", math, 4);

        Question[] questionsGrade1 = {question1Grade1, question2Grade1, question3Grade1, question4Grade1, question5Grade1};
        Question[] questionsGrade2 = {question1Grade2, question2Grade2, question3Grade2, question4Grade2, question5Grade2};
        Question[] questionsGrade3 = {question1Grade3, question2Grade3, question3Grade3, question4Grade3, question5Grade3};
        Question[] questionsGrade4 = {question1Grade4, question2Grade4, question3Grade4, question4Grade4, question5Grade4};

        Discipline disciplineMathGrade1 = new Discipline("Math Grade 1", questionsGrade1);
        Discipline disciplineMathGrade2 = new Discipline("Math Grade 2", questionsGrade2);
        Discipline disciplineMathGrade3 = new Discipline("Math Grade 3", questionsGrade3);
        Discipline disciplineMathGrade4 = new Discipline("Math Grade 4", questionsGrade4);

        Test randomTestGrade1A = new Test(generateRandomTest(), 1, 2024, 1, disciplineMathGrade1);
        Test randomTestGrade1B = new Test(generateRandomTest(), 1, 2024, 1, disciplineMathGrade1);

        Test randomTestGrade2A = new Test(generateRandomTest(), 2, 2024, 1, disciplineMathGrade2);
        Test randomTestGrade2B = new Test(generateRandomTest(), 2, 2024, 1, disciplineMathGrade2);

        Test randomTestGrade3A = new Test(generateRandomTest(), 3, 2024, 1, disciplineMathGrade3);
        Test randomTestGrade3B = new Test(generateRandomTest(), 3, 2024, 1, disciplineMathGrade3);

        Test randomTestGrade4A = new Test(generateRandomTest(), 4, 2024, 1, disciplineMathGrade4);
        Test randomTestGrade4B = new Test(generateRandomTest(), 4, 2024, 1, disciplineMathGrade4);

        Student sophia = new Student(1, "Sophia");
        String[] answersSophia = {"4", "7", "16", "3", "4"};
        TestAnswer sophiaAnswers = new TestAnswer(randomTestGrade1A, sophia, answersSophia);
        sophiaAnswers.gradeTest();

        Student gabriel = new Student(1, "Gabriel");
        String[] answersGabriel = {"3", "4", "14", "3", "6"};
        TestAnswer gabrielAnswers = new TestAnswer(randomTestGrade1B, gabriel, answersGabriel);
        gabrielAnswers.gradeTest();

        Student beatrice = new Student(2, "Beatrice");
        String[] answersBeatrice = {"11", "14", "20", "6", "6"};
        TestAnswer beatriceAnswers = new TestAnswer(randomTestGrade2A, beatrice, answersBeatrice);
        beatriceAnswers.gradeTest();

        Student samuel = new Student(2, "Samuel");
        String[] answersSamuel = {"12", "15", "22", "5", "7"};
        TestAnswer samuelAnswers = new TestAnswer(randomTestGrade2B, samuel, answersSamuel);
        samuelAnswers.gradeTest();

        Student laura = new Student(3, "Laura");
        String[] answersLaura = {"36", "17", "5", "18", "40"};
        TestAnswer lauraAnswers = new TestAnswer(randomTestGrade3A, laura, answersLaura);
        lauraAnswers.gradeTest();

        Student john = new Student(3, "John");
        String[] answersJohn = {"35", "18", "7", "19", "36"};
        TestAnswer johnAnswers = new TestAnswer(randomTestGrade3B, john, answersJohn);
        johnAnswers.gradeTest();

        Student anna = new Student(4, "Anna");
        String[] answersAnna = {"25", "6", "11", "54", "25"};
        TestAnswer annaAnswers = new TestAnswer(randomTestGrade4A, anna, answersAnna);
        annaAnswers.gradeTest();

        Student peter = new Student(4, "Peter");
        String[] answersPeter = {"24", "7", "10", "50", "26"};
        TestAnswer peterAnswers = new TestAnswer(randomTestGrade4B, peter, answersPeter);
        peterAnswers.gradeTest();

        Boolean displayQuestions = false;

        if (displayQuestions) {
            displayTest(randomTestGrade1A);
            displayTest(randomTestGrade1B);
            displayTest(randomTestGrade2A);
            displayTest(randomTestGrade2B);
            displayTest(randomTestGrade3A);
            displayTest(randomTestGrade3B);
            displayTest(randomTestGrade4A);
            displayTest(randomTestGrade4B);
        }
    }

    public static String generateRandomTest() {
        String[] tests = {"A", "B"};
        int random = (int) (Math.random() * tests.length);
        return tests[random];
    }

    public static void displayTest(Test test) {
        System.out.println("............................................");
        for (var item : test.getRandomTest()) {
            System.out.println(item.toString());
        }
    }
}

