package tma;
/**
 *
 * @author Esraa Magdy
 */
public class Passenger extends Mutual{
//Make an attribute    
    private String seat_num;


// Make a constructor
    public Passenger(String seat_num, String id, String name, String address) {
        super(id, name, address);
        this.seat_num = seat_num;
    }
    
//Make a getter for a seat number
    public String getSeat_num() {
        return seat_num;
    }

//Make a setter for a seat number
    public void setSeat_num(String seat_num) {
        this.seat_num = seat_num;
    }

//override toString method
    @Override
    public String toString() {
        return super.toString() + "Passenger{" + "seat_num=" + seat_num + '}';
    }


//overeride equals method
    @Override
    public boolean equals(Object o) {
        Passenger pas=(Passenger)o;
        return this.getId().equals(pas.getId());
    }   
}
