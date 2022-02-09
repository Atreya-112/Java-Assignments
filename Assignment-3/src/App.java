import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class App {
    public  static void main(String[] args) throws Exception {
        ArrayList<Employee> list = ReadEmp.read();
        System.out.println(list);
    }
}
