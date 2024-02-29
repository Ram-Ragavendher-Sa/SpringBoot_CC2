package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FoodOrder;
import com.example.demo.repository.FoodOrderRepo;

@Service
public class FoodOrderService {
    @Autowired
    FoodOrderRepo sr;

    
    public FoodOrder create(FoodOrder s) {
        return sr.save(s);
    }

    public FoodOrder getById(int i) {
        return sr.findById(i).orElse(null);
    }
    public void delete (int id)
    {
         sr.deleteById(id);
    }
   public FoodOrder updateFoodOrder(int id,FoodOrder food)
   {
    FoodOrder s=sr.findById(id).orElse(null);
    if(s!=null)
    {
        s.setId(food.getId());
        s.setProductId(food.getProductId());
        s.setPrice(food.getPrice());
    }
    return sr.save(s);
}

}