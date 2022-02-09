import java.util.ArrayList;

public class App {
    public  static void main(String[] args) throws Exception {
        ArrayList<Employee> list = ReadEmp.read();
        Search.searchByName(list);
    }
}
