import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Quiz {
    private List<Question> questions = new ArrayList<>();
    private int correctCount = 0;
    private int wrongCount = 0;

    void addQuestion(Question question) {
        questions.add(question);
    }

    void execute() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());

            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println(i + " : " + options[i]);
            }

            System.out.println("Ваш ответ: ");
            int num = scanner.nextInt();

            if (num == question.getCorrectAnswer()) {
                correctCount++;
            } else {
                wrongCount++;
            }

            System.out.println();
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}