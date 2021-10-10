/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author anshitaverma
 */
public class Carlist {
    private ArrayList<Car> details;
    private Set<Integer> serialNumbers;
    private Date timeStamp;

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    
    public Carlist(){
        this.details=new ArrayList<Car>();
        this.serialNumbers = new HashSet<>();
    }

    public ArrayList<Car> getDetails() {
        return details;
    }
    
     public Set<Integer> getSerialNumbers() {
        return serialNumbers;
    }

    public void setDetails(ArrayList<Car> details) {
        this.details = details;
    }
    
    public Car addNewCars(){
        Car newCar= new Car();
        details.add(newCar);
        return newCar;
    }
    
    public void updateCar(Car cr){
        
       for(int i = 0 ; i < details.size() ; i++)   
       {
           if(details.get(i).getSerialNumber() == (cr.getSerialNumber()))
           {
               int index = i;
               details.set(i,cr);
           }
       }
    }
    
    public void deleteCars(Car cr){
        details.remove(cr);
        
    }
    
    public void addSerialNumber(int serialNumber)
    {
        serialNumbers.add(serialNumber);
    }
}
