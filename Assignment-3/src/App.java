import java.util.ArrayList;

public class App {
    public  static void main(String[] args) throws Exception {
        String choice = "-1";
        do {
            ArrayList<Employee> list = ReadEmp.read();
            Menu.menu();
            System.out.print("Enter you choice : ");
            choice = Scan.sc.nextLine();
            switch (choice) {
            case "1":
            AddEmp.add();
                break;
            case "2":
            Delete.delete();
                break;
            case "3":
            SearchMenu.menu();
            System.out.print("Enter your choice : ");
            String c = Scan.sc.nextLine();
            switch (c) {
                case "1":
                Search.searchByName(list);
                System.out.println();
                    break;
                case "2":
                Search.searchByEmail(list);
                System.out.println();
                    break;
                case "3":
                Search.searchByAge(list);
                System.out.println();
                    break;
                case "4":
                Sort.sortByName(list);
                System.out.println();
                    break;
                case "5":
                Sort.sortByAge(list);
                System.out.println();
                    break;
                default:
                    break;
            }
            case "0":
                break;
            default:
            System.out.println("Enter valid choice.");
                break;
            }
        } while (!choice.equals("0")); 
    }
}
