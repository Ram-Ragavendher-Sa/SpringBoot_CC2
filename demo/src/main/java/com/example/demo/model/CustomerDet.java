package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerDet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String Customer_Name;
    private String Cust_Address;
    private int ph_num;

  @OneToOne(targetEntity =FoodOrder.class, cascade = CascadeType.ALL )
  
  @JoinColumn(name="cust_id")

  private FoodOrder foodorder;

    public CustomerDet() {
    }
    public CustomerDet(int customer_id, String customer_Name, String cust_Address, int ph_num) {
        this.customer_id = customer_id;
        Customer_Name = customer_Name;
        Cust_Address = cust_Address;
        this.ph_num = ph_num;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public String getCustomer_Name() {
        return Customer_Name;
    }
    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }
    public String getCust_Address() {
        return Cust_Address;
    }
    public void setCust_Address(String cust_Address) {
        Cust_Address = cust_Address;
    }
    public int getPh_num() {
        return ph_num;
    }
    public void setPh_num(int ph_num) {
        this.ph_num = ph_num;
    }
    public Object findById(int id) {
        return null;
    }
    
}
