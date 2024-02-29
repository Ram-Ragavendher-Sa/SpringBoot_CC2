package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HotelDet {
    @Id
    private int HotelId;
    private String Name;  
    private String Address;
    private String OrderID;

    public HotelDet() {
    }
    
    public HotelDet(int hotelId, String name, String address, String orderID) {
        HotelId = hotelId;
        Name = name;
        Address = address;
        OrderID = orderID;
    }

    public int getHotelId() {
        return HotelId;
    }
    public void setHotelId(int hotelId) {
        HotelId = hotelId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }
    
    
}
