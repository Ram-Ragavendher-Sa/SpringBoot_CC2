package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CustomerDet;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
    
    @Autowired
    CustomerService ss;

    @PostMapping("/create2")
    public CustomerDet postMethodName(@RequestBody CustomerDet entity) {
        return ss.create(entity);
    }

    @GetMapping("/getme2/{id}")
    public CustomerDet getMethodName(@PathVariable int id) {
        return ss.getById(id);
    }

    @DeleteMapping("/sp2/{id}")
    public void deletesp(@PathVariable("id") int id) {
        ss.delete(id);
    }

    @PutMapping("path2/{id}")
    public CustomerDet updateFoodOrder(@PathVariable int id, @RequestBody CustomerDet food) {
        return ss.updateFoodOrder(id, food);
    }

    // @GetMapping("/customers")
    // public Page<CustomerDet> getAllCustomers(
    //         @RequestParam(defaultValue = "0") Integer pageNo,
    //         @RequestParam(defaultValue = "5") Integer pageSize,
    //         @RequestParam(defaultValue = "id") String sortBy) {
        
    //     Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
    //     return ss.getAllCustomers(pageable);
    // }
    @GetMapping("/pagination/{offset}/{pagesize}")
    public List<CustomerDet> pagination(@PathVariable("offset") int id,@PathVariable("pagesize") int pagesize){
        return ss.pagination(id, pagesize);
    }
    @GetMapping("/sorts/{field}")
    public List<CustomerDet> sorting(@PathVariable("field") String name){
        return ss.sorting(name);
    }
    // public SomeData getMethodName(@RequestParam String param) {
    //     return new SomeData();
    // }
    
    // public SomeData getMethodName(@RequestParam String param) {
    //     return new SomeData();
    // }
    
}
