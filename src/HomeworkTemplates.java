import java.util.Scanner;


public class HomeworkTemplates {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;

        String[] questions = {"В каком году был разработан Java?", "Кто придумал Java?", "Максимальное значение типа byte в Java?"};

        String[][] answerOptions = {{"1979", "1995", "2012", "1998", "2000"}, {"Джеймс Гослинг", "Райан Гослинг", "Билл Гейтс", "Бьёрн Страуструп"}, {"64", "127", "32", "128"}};

        int[] correctAnswers = {1, 0, 1};



        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(j + " : " + answerOptions[i][j]);
            }

            int num = -1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ваш ответ: ");


            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println("Введено не число!");
            }


            if (num == correctAnswers[i]) {
                correctCount++;
            } else {
                wrongCount++;
            }

            System.out.println();
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}