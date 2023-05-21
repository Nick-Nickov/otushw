import java.io.IOException;

public class FileProcessor {
    // 1 способ
    public void processFile() {
        try (FileReader fileReader = new FileReader()) {
            fileReader.read();
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    // 2 способ
    public void processFileRethrow() throws IOException {
        try (FileReader fileReader = new FileReader()) {
            fileReader.read();
        } catch (IOException e) {
            throw e;
        }
    }

    // 3 способ
    public void processFileCustom() {
        try (FileReader fileReader = new FileReader()) {
            fileReader.read();
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
