import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationTest {
    public static void main(String[] args) {
        List<Student> sList  = new ArrayList<>();
        String filename = "output2.ser";
        File file = new File(filename);
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            try {
                sList = (List<Student>) ois.readObject();
                System.out.println(sList);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
