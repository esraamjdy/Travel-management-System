package tma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Esraa Magdy
 */
public class Manager {
    
//Create a collection that contains the trips 
    static ArrayList <Trip> trip_m = new ArrayList();    
    
//Method to add a trip
    public static void addTripp(Trip t){ 
        boolean found=true;
        for(Trip i:trip_m){
            if(t.equals(i)){
                System.out.println("Trip with number ("+t.getTrip_num()+") already eists");
                found = false;
                break;
            }
        } 
        if(found){
            trip_m.add(t);
            System.out.println("Trip with number("+t.getTrip_num()+") was added");
        }        
    }   
//Method to add Passenger
    public static void AddPassenger(Trip t, Passenger p){

        boolean x=false;
        int a= Integer.valueOf(t.getMax_pas());
        if (a>t.getAddPassenger().size()){
            if (t.getAddPassenger().contains(p)){
            System.out.println("Passenger exists");
            }
            else{
                for(Trip k:trip_m){
                    if(k.equals(t)){
                        x=true;
                        t.getAddPassenger().add(p);
                        System.out.println("The Passenger was added");
                        break;
                    }
                }
                if(!x){
                    System.out.println("This trip doesn't exist, Enter a valid one:");
                }
            }
        }
        else{
            System.out.println("Trip is full");
        }
        
    }   
//Method for Removing a passenger
    public static void RemovePassenger(Trip t, Passenger p){
        if(t.getAddPassenger().contains(p)){
            for(Trip k: trip_m){
                if(k.equals(t)){
                    t.getAddPassenger().remove(p);
                    System.out.println("A passenger was removed");
                    break;
                }
                else{
                    System.out.println("Passenger doesn't exist in the trip");
                }
            }      
        
    }
    }
    
//Method for retrieving the average     
    public static void Average(String datte){
        double total=0;
        double counter =0;
        for(Trip t:trip_m){
            if (t.getD().equals(datte)){
                total += t.addPassenger.size();
                counter++;
            }
        }
        System.out.println("The average of passengers per trip of the date "+datte+" is: "+ total/counter); 
    }
   
//Method to display the trips
    public static void display(){
        ArrayList<String> dateList=new ArrayList();
        for (Trip t: trip_m ){
            if(dateList.contains(t.getD())==false)
            dateList.add(t.getD()); 
        }
        Collections.sort(dateList);
        Collections.sort(trip_m);
        
        for(String a:dateList){
            StringBuilder s =new StringBuilder();
            s.append(a);
            s.append(": ");
            for(Trip x : trip_m){
                if(x.getD().equals(a)){
                    
                    s.append("Trip(").append(x.getTrip_num()).append(") ");
                }
            }
            System.out.println(s);
        }
        
    }
    
//Method to save data    
    public static void TextFile(){
        File f=new File("C:\\Users\\Esraa Magdy\\Desktop\\esraa.txt");
        try {
            PrintWriter pr =new PrintWriter(f);
            for (Trip x : trip_m) {
                pr.println(x.toString());
            }
            pr.close();
        } catch(Exception e) {
            System.out.println("There is an error: "+e);
        } finally {
            System.out.println("Done");
        } 
    }          
}
