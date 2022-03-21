import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileToString {
    public static String readFile(String fileName) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
