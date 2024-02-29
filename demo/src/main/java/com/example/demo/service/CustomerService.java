package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.CustomerDet;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo cu;

    public CustomerDet create(CustomerDet s) {
        return cu.save(s);
    }

    public CustomerDet getById(int i) {
        return cu.findById(i).orElse(null);
    }

    public void delete(int id) {
        cu.deleteById(id);
    }

    public CustomerDet updateFoodOrder(int id, CustomerDet food) {
        CustomerDet s = cu.findById(id).orElse(null);
        if (s != null) {
            s.setCustomer_id(food.getCustomer_id());
            s.setCustomer_Name(food.getCustomer_Name());
            s.setCust_Address(food.getCust_Address());
            s.setPh_num(food.getPh_num());
        }
        return cu.save(s);
    }

    public List<CustomerDet> pagination(int id,int pageSize){
        return cu.findAll(PageRequest.of(id, pageSize)).getContent();
    }
    public List<CustomerDet> sorting(String name){
        return cu.findAll(Sort.by(name));
    }
    // public Page<CustomerDet> getAllCustomers(Pageable pageable) {
    //     return cu.findAll(pageable);
    // }
    
}
