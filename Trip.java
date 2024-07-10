package tma;
/**
 *
 * @author Esraa Magdy
 */
import java.util.ArrayList;

//create a class trip th
public class Trip implements Comparable{
    private String trip_num;
    private String d;
    private String bus_type;
    private String destination;
    private String time_taken;
    private String max_pas;
    private Driver driver;
    ArrayList <Passenger> addPassenger= new ArrayList();
    
//getter method for Driver 
    public Driver getDriver() {
        return driver;
    }

    //setter method for driver
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
//getter method for trip number
    public String getTrip_num() {
        return trip_num;
    }
//setter method for trip number 
    public void setTrip_num(String trip_num) {
        this.trip_num = trip_num;
    }
//getter method for bus type
    public String getBus_type() {
        return bus_type;
    }
//setter for bus type
    public void setBus_type(String bus_type) {
        this.bus_type = bus_type;
    }
//getter for bus destination
    public String getDestination() {
        return destination;
    }

//setter for bus destination
    public void setDestination(String destination) {
        this.destination = destination;
    }

//getter method for bus the time bus takes 
    public String getTime_taken() {
        return time_taken;
    }

    //setter method for the time bus takes 
    public void setTime_taken(String time_taken) {
        this.time_taken = time_taken;
    }

//getter method for 
    public String getMax_pas() {
        return max_pas;
    }
    
//setter method for the maximum number of passengers 
    public void setMax_pas(String max_pas) {
        this.max_pas = max_pas;
    }

//getter method for the date
    public String getD() {
        return d;
    }
//setter method for the date
    public void setD(String d) {
        this.d = d;
    }
    
//constructors
    public Trip(String trip_num, String bus_type, String destination, String time_taken, String max_pas, Driver driver, Passenger passenger, String d) {
        this.trip_num = trip_num;
        this.bus_type = bus_type;
        this.destination = destination;
        this.time_taken = time_taken;
        this.max_pas = max_pas;
        this.d=d;
        this.driver = driver;
    }
    
    //default constructor
    public Trip() {
    }

    //getter method for the array list of passengers
    public ArrayList<Passenger> getAddPassenger() {
        return addPassenger;
    }

    //setter method for the array list of passengers
    public void setAddPassenger(ArrayList<Passenger> addPassenger) {
        this.addPassenger = addPassenger;
    }    
    
  //overeride equals method
    @Override
    public boolean equals(Object o) {
        Trip e =(Trip)o;
        return this.getD().equals(e.getD()) && this.trip_num.equals(e.trip_num);
    }
    
    //override toString method
    @Override
    public String toString() {
        return "Trip{" + "trip_num=" + trip_num + ", d=" + d + ", bus_type=" + bus_type + ", destination=" + destination + ", time_taken=" + time_taken + ", max_pas=" + max_pas + ", driver=" + driver + ", addPassenger=" + addPassenger + '}';
    }

    //compareto method for interface
    @Override
    public int compareTo(Object t) {
        Trip t1=(Trip)t;    
        return this.getTrip_num().compareTo(t1.getTrip_num());
    }  
}
