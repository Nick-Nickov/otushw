import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question("В каком году был разработан Java?", new String[]{"1979", "1995", "2012", "1998", "2000"}, 1));
        quiz.addQuestion(new Question("Кто придумал Java?", new String[]{"Джеймс Гослинг", "Райан Гослинг", "Билл Гейтс", "Бьёрн Страуструп"}, 0));
        quiz.addQuestion(new Question("Максимальное значение типа byte в Java?", new String[]{"64", "127", "32", "128"}, 1));

        quiz.execute();
    }
}
