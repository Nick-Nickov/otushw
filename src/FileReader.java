import java.io.Closeable;
import java.io.IOException;

//Класс-заглушка с имитацией работы с файлом
public class FileReader implements Closeable {
    private boolean isOpen = false;

    public FileReader() {
        isOpen = true;
    }

    public void read() throws IOException {
        if (!isOpen) {
            throw new IOException("Close FileReader");
        }
        System.out.println("Reading file...");
    }

    @Override
    public void close() {
        isOpen = false;
    }
}
