import java.util.ArrayList;

public class App {
    public  static void main(String[] args) throws Exception {
        ArrayList<Employee> list = new ArrayList<>();
        list = ReadEmp.read();
        System.out.println(list);
    }
}
