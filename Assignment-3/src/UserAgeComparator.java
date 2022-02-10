import java.util.Comparator;

public class UserAgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.parseInt(o1.getEm(2)) - Integer.parseInt(o2.getEm(2));
    }
}