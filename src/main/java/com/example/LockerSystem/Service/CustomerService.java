package com.example.LockerSystem.Service;

import com.example.LockerSystem.Entities.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer addCustomer(Customer customer);
}
