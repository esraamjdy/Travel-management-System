package tma;
/**
 *
 * @author Esraa Magdy
 */
public class Driver extends Mutual {
    private String tel_num;
    
    //class constructor
    public Driver(String tel_num, String id, String name, String address) {
        super(id, name, address);
        this.tel_num = tel_num;
    }
    
    //getter method for telephone number
    public String getTel_num() {
        return tel_num;
    }
    
    //setter method for telephone number
    public void setTel_num(String tel_num) {
        this.tel_num = tel_num;
    }

    //override toString method
    @Override
    public String  toString() {
        return super.toString() +"Driver{" + "tel_num=" + tel_num + '}';
    }
    
  //overeride equals method
    @Override
    public boolean equals(Object o) {
        Driver e =(Driver)o;
        return this.getId().equals(e.getId());
    }
}
