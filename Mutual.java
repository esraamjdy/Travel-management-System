package tma;
/**
 *
 * @author Esraa Magdy
 */
public class Mutual {
    private String id, name, address;
    
//make getter and setter for The id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//Make getter and setter for the name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//Make getter and setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
//Make a constructor   
    public Mutual(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

//Override toString Method
    @Override
    public String toString() {
        return "Mutual{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }   
}
