
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Student implements Serializable{
    private static final long serialVersionUID = 4990446585793915469L;
    private String firstName;
    private String dateOfBirth;
    //private Date dateOfBirth;
    private Address address;

    public Student(String firstName, String dateOfBirth, Address address) throws ParseException{
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
    // public Student(String firstName, Date dateOfBirth, Address address) throws ParseException{
    //     this.firstName = firstName;
    //     this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth);
    //     this.address = address;
    // }

    public String getFirstName() {
        return firstName;
    }
    public String getDateOfBirth() {
        //return new SimpleDateFormat("dd/MM/yyyy").format(this.dateOfBirth);
        return dateOfBirth;
    }
    public Address getAddress() {
        return address;
    }
    @Override
    public String toString(){
        return getFirstName() + " ," + getDateOfBirth();
    }   
    private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException{
        firstName = (String)in.readObject();
        
    
    }
}
