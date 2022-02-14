import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class SerializationTest {
    public static void main(String[] args) throws ParseException {
        Address s1,s2,s3,s4;
        s1 = new Address("Indore", "Madhya Pradesh", 452056, "India");
        s2 = new Address("Bangalore", "Karanataka", 892076, "India");
        s3 = new Address("Mumbai", "Maharashtra", 660046, "India");
        s4 = new Address("Coimbatore", "Tamil Nadu", 789021, "India");
        Student sI = new Student("Atreya","16/12/2002", s1);
        Student sII = new Student("Aditya", "12/12/2002", s2);
        Student sIII = new Student("Anay", "06/06/2002", s3);
        Student sIV = new Student("Neon", "21/06/2002", s4);
        List<Student> sList = new ArrayList<>();
        sList.add(sI);
        sList.add(sII);
        sList.add(sIII);
        sList.add(sIV);
        String filename = "output2.ser";
        File file = new File(filename);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(sList);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}
