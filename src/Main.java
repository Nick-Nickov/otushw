import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();

        // Обработка ошибки 1 способом
        processor.processFile();

        // Обработка 2 способом
        try {
            processor.processFileRethrow();
        } catch (IOException e) {
            System.out.println("Error in processFileRethrow: " + e.getMessage());
        }

        // Обработка 3 способом
        processor.processFileCustom();
    }
}
