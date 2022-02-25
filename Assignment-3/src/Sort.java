import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void sortByName(ArrayList<Employee> list){
        Collections.sort(list,new UserNameComparator());
        System.out.println(list);
    }
    public static void sortByNameDes(ArrayList<Employee> list){
        Collections.sort(list,new UserNameComparator());
        System.out.println(list);
    }
    public static void sortByAgeDescending(ArrayList<Employee> list){
        Collections.sort(list,new UserAgeComparator().reversed());
        System.out.println(list);
    }
    public static void sortByAge(ArrayList<Employee> list){
        Collections.sort(list,new UserAgeComparator());
        System.out.println(list);
    }
}
