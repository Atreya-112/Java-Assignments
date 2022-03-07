import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Address implements Serializable{
    String  city;
    String state;
    int pinCode;
    String country;
    
    public Address(String city,String state,int pinCode,String country){
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;
    }

    @Override
    public String toString(){
        return city + ", " + state + ", " + pinCode + ", " + country; 
    }
    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException{
        in.defaultReadObject();
    }
}
