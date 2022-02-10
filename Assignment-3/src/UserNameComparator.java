import java.util.Comparator;

public class UserNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEm(0).compareTo(o2.getEm(0));
    }
    
}
