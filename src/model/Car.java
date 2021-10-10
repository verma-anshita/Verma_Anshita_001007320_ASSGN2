/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author anshitaverma
 */
public class Car {
    private String company;
    private boolean available;
    private String manufacturedYear;
    private int numberOfSeat;
    private int serialNumber;
    private String modelNumber;
    private boolean regUber;
    private boolean mtCertificate;
    private String city;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    

   

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isRegUber() {
        return regUber;
    }

    public void setRegUber(boolean regUber) {
        this.regUber = regUber;
    }

    public boolean isMtCertificate() {
        return mtCertificate;
    }

    public void setMtCertificate(boolean mtCertificate) {
        this.mtCertificate = mtCertificate;
    }
    
    

  
    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString(){
        return company;
    }
    
    
    
}
