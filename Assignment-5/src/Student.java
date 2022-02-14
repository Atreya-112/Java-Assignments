import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Student implements Serializable{
    private String firstName;
    // private String dateOfBirth;
    private Date dateOfBirth;
    private Address address;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    public Student(String firstName, String dateOfBirth, Address address) throws ParseException{
        this.firstName = firstName;
        this.dateOfBirth = formatter.parse(dateOfBirth);
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getDateOfBirth() {
        return new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).format(this.dateOfBirth);
    }
    public Address getAddress() {
        return address;
    }
    @Override
    public String toString(){
        return getFirstName() + " ," + getDateOfBirth();
    }

}
