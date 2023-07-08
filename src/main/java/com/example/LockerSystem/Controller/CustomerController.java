package com.example.LockerSystem.Controller;

import com.example.LockerSystem.Entities.Customer;
import com.example.LockerSystem.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerController() {
    }

    @PostMapping("/api/users")
    public ResponseEntity<Customer> createUser(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.addCustomer(customer));
    }

    @PostMapping("api/login")
    public void loginUser(
            @RequestParam String username,
            @RequestParam String passwords){


    }
//
//    @PostMapping("api/logout")
//    public void logoutUser(){
//    }
//
//    @PutMapping("api/reset-password")
//    public void logoutUser(){
//    }

}
