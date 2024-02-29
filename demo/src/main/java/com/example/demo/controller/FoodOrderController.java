package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.FoodOrder;
import com.example.demo.service.FoodOrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class FoodOrderController {
    @Autowired
    FoodOrderService ss;

    
    @PostMapping("/create")
    public FoodOrder postMethodName(@RequestBody FoodOrder entity) {
        return ss.create(entity);
    }
    @GetMapping("/getme/{id}")
    public FoodOrder getMethodName(@PathVariable int id) {
        return ss.getById(id);
    }
    @DeleteMapping("/sp/{id}")
    public void deletesp(@PathVariable("id") int id)
    {
        ss.delete(id);
    }
    @PutMapping("path/{id}")
    public FoodOrder updateFoodOrder(@PathVariable int id,@RequestBody FoodOrder food)
    {
        return ss.updateFoodOrder(id, food);
}

    
}