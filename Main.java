package tma;
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create 7 trips:
        //create trip(1) 
        Driver d1= new Driver("01000022562","11u","Ahmed","Tanta"); 
        Trip t1= new Trip("1","single-decker bus","Cairo","30","2",d1,null,"1/12/2022");
        
        //create trip 2
        Driver d2= new Driver("01000022567","22b","Abdelsalam","Rasheed"); 
        Trip t2= new Trip("2","double-decker bus","Alexandria","10","15",d2,null,"2/12/2022");
        
        //create trip 3
        Driver d3= new Driver("01000022543","a33","Mohanad","Tagamoa"); 
        Trip t3= new Trip("3","single-decker bus","Sharm Elsheikh","10","20",d3,null,"3/12/2022");
        
        //create trip 4
        Driver d4= new Driver("01000022598","a44","Mounir","Mahala"); 
        Trip t4= new Trip("4","erg","Alexandria","10","20",d4,null,"2/12/2022");
        
        //create trip 5
        Driver d5= new Driver("01000022555","s55","Salah","Alexandria"); 
        Trip t5= new Trip("5","single-decker bus","Marsa Matrouh","10","24",d5,null,"3/12/2022");
        
        //create trip 6
        Driver d6= new Driver("01000022587","6b6","Adel","Cairo"); 
        Trip t6= new Trip("6","low-floor buses","Mansoura","10","18",d6,null,"1/12/2022");
        
        //create trip 7
        Driver d7= new Driver("01000022510","77a","Sabry","Cairo"); 
        Trip t7= new Trip("7","midibuses","Mokatam","10","17",d7,null,"3/12/2022");
        
        //add the 7 trips to the array list(collection)
        //add trip 1
        Manager.addTripp(t1);
        
        //add trip 2
        Manager.addTripp(t2);
        
        //add trip 3
        Manager.addTripp(t3);
        
        //add trip 4
        Manager.addTripp(t4);
        
        //add trip 5
        Manager.addTripp(t5);
        
        //add trip 6
        Manager.addTripp(t6);

        //add trip 7
        Manager.addTripp(t7);
        Manager.addTripp(t7);
        
        
        System.out.println("\n");
        
    //create passenger and add it to a spescific trip
        // Add Passenger 1 to trip 1
       Passenger p1=new Passenger("1","2343","Esraa","Tanta");  
       Manager.AddPassenger(t1, p1);
       
       //Add Passenger 2 to trip 2
       Passenger p2=new Passenger("4","a2","Omar","Sharkia");  
       Manager.AddPassenger(t2, p2);
       
      //Passenger 3
       Passenger p3=new Passenger("6","c71","Abdo","Zagazig");  
       Manager.AddPassenger(t3, p3);
       
       //Passenger 4
       Passenger p4=new Passenger("12","iu9","Esraa","Tanta");  
       Manager.AddPassenger(t4, p4);
       
       //Passenger 5
       Passenger p5=new Passenger("8","t54","Esraa","Tanta");  
       Manager.AddPassenger(t5, p5);
       
       //Passenger 6
       Passenger p6=new Passenger("3","45ed","Esraa","Tanta");  
       Manager.AddPassenger(t6, p6);
       
       //Passenger 7
       Passenger p7=new Passenger("9","g56","nour","Tanta");  
       Manager.AddPassenger(t1, p7);
       
    //adding a passenger to a full trip
       Manager.AddPassenger(t1, p3);
       
    //adding an existing passenger to his trip   
       Manager.AddPassenger(t6, p6);
       
    //remove a passenger from a trip   
       Manager.RemovePassenger(t1, p1);
       
    //retrieving the average
       Manager.Average("3/12/2022");
       
    //displaying the trips
       Manager.display();

    //saving data into file   
       Manager.TextFile();
    
        
    }   
    
}
